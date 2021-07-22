package com.meiji.biz.request.http.shop

import com.miyuan.ifat.support.test.TestContext

class GetAfterLog extends ShopPost {
    {
        super.api = "order/getAfterLog"
        super.params =  ["afterCode","shopId"]
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

}
