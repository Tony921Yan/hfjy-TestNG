package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ListGiftsFromMe extends MallPost {
    {
        super.api = "gift/listGiftsFromMe"
        super.params =  ["page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
