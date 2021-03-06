package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GoodsPropertyValIsUsed extends MeijiRequest{
    {
        super.api = "/platform/goodPropertyMgr/goodsPropertyValIsUsed"
        super.params = ["id"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
