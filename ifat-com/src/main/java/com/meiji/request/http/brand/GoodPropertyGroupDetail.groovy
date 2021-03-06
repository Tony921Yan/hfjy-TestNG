package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GoodPropertyGroupDetail extends MeijiRequest{
    {
        super.api = "/platform/GoodPropGroupMgr/GoodPropertyGroupDetail"
        super.params = ["id"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}