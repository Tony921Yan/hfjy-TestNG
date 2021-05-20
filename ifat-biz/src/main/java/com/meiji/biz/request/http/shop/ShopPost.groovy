package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.JsonUtil
import com.miyuan.ifat.support.util.ResourceUtil
import com.miyuan.ifat.support.vo.Record
import org.apache.commons.lang3.ObjectUtils

import java.lang.reflect.Method

abstract class ShopPost {
    public String api
    public List params
    public String preInvoke

    ShopPost invoke(TestContext testContext){
        String url  = ResourceUtil.getBeanData("http").get("url1")+api
        Map heads = new HashMap()
        heads.put("timestamp",testContext.get("timestamp"))
        heads.put("nonce",testContext.get("nonce"))
        heads.put("Content-Type",testContext.get("Content-Type"))
        heads.put("userId",11)
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

    ShopPost preInvoke(TestContext testContext){
        if(preInvoke!=null){
            Class clazz = Class.forName(preInvoke)
            Method method1 = clazz.getMethod("invoke", TestContext.class)
            method1.invoke(clazz.newInstance(),testContext)
            Method method2 = clazz.getMethod("afterInvoke", TestContext.class)
            method2.invoke(clazz.newInstance(),testContext)
        }
        return this
    }

    ShopPost afterInvoke(TestContext testContext){

    }

    ShopPost baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "0"
        return this
    }

    ShopPost specialAssert(TestContext testContext){
    }

}