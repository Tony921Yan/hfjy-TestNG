package com.meiji.biz.request.http.shop.shopinfo

import com.meiji.biz.request.http.shop.ShopPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class HomePage extends ShopPost {
    {
        super.api = "/statistics/homePage"
        super.params =  [ "shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    ShopPost specialAssert(TestContext testContext){
    }
}
