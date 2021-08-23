package com.meiji.biz.request.http.thirdparty.kj


import com.meiji.biz.service.CookieService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class KJPost {
    public String api
    public List params
    public String preInvoke

    KJPost invoke(TestContext testContext){
        String shopUrl = ResourceUtil.getBeanData("http").get("thirdparty")
        String url  = shopUrl+api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        Long dealerId = Long.valueOf(testContext.get("dealerId").toString())
        heads.put("cookie",CookieService.getShopCookie(shopUrl,dealerId))
//        String aesKey = MD5Utils.MD5Encode("11", "utf-8")
//        String tokenAes = AESOperator.encrypt(testContext.get("token").toString(), aesKey)
//        heads.put("token",tokenAes)

//        if(TestEnv.getIsGray()=="true"){
//            heads.put("isGrayRelease",true)
//        }
        Map req = new HashMap()
        for(String str:params){
            if(ObjectUtils.isNotEmpty(testContext.get(str))){
                req.put(str,JsonUtil.objectParse(testContext.get(str)))
            }
        }
        testContext.appendLog(new Record("接口地址",url))
        testContext.appendLog(new Record("请求头",heads))
        testContext.appendLog(new Record("请求参数",req))
        String res = HttpUtil.post(url,heads, req)
        testContext.setResponse(res)
        testContext.appendLog(new Record("返回结果",res))
        return this
    }

    KJPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    KJPost afterInvoke(TestContext testContext){

    }

    KJPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

    KJPost specialAssert(TestContext testContext){
    }

}