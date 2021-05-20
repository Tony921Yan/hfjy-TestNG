package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class GetOrderLogisticsInfo extends ShopGet {
    {
        super.api = "/platform/orderMgr/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}