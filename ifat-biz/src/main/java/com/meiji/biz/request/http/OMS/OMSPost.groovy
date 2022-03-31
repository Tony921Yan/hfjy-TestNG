package com.meiji.biz.request.http.OMS

import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestEnv
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class OMSPost {
    public String api
    public List params
    public String preInvoke

    OMSPost invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("oms")
        String username = testContext.get("omsUsername")
        String password = testContext.get("omsPassword")
        String cookie = CookieService.getOMSCookie(url,username,password)
        url = url +api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("Cookie", cookie)
        String uuid = UUID.randomUUID().toString()
        heads.put("userLogTracingTag",uuid)
        heads.put("isUserLogTracing",true)
        if(TestEnv.isGray()=="true"){
            heads.put("isGrayRelease",true)
        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        def result = HttpUtil.post(url,heads, req)
        testContext.setResult(result)
        testContext.appendLog(new Record("返回结果",result.getResp()))
        return this
    }

    OMSPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    OMSPost afterInvoke(TestContext testContext){

    }

    OMSPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

    OMSPost specialAssert(TestContext testContext){
    }

}
