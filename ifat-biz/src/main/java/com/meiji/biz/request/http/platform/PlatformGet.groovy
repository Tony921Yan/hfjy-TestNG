package com.meiji.biz.request.http.platform

import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class PlatformGet {
    public String api
    public List params
    public String preInvoke

    PlatformGet invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("url")+api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("userId","11")
        heads.put("shopId","1")
//        String aesKey = MD5Utils.MD5Encode("11", "utf-8")
//        String tokenAes = AESOperator.encrypt(testContext.get("token").toString(), aesKey)
//        heads.put("token",tokenAes)

//        if(TestEnv.getIsGray()=="true"){
//            heads.put("isGrayRelease",true)
//        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,testContext.get(str))
            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.get(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    PlatformGet preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    PlatformGet afterInvoke(TestContext testContext){

    }

    PlatformGet baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    PlatformGet specialAssert(TestContext testContext){
    }

}