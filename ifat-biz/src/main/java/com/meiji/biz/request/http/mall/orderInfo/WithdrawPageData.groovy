package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class WithdrawPageData extends MallPost {
    {
        super.api = "pay/withdrawPageData"
        super.params =  ["shopId"]
    }

    WithdrawPageData invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WithdrawPageData preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WithdrawPageData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
