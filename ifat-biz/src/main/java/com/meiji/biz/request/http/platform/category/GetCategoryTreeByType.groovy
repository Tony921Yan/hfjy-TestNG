package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetCategoryTreeByType extends PlatformPost {
    {
        super.api = "GoodsDetailManage/getCategoryTreeByType"
        super.params = ["type"]
    }

    GetCategoryTreeByType invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategoryTreeByType preInvoke(TestContext testContext) {
        super.preInvoke(testContext)
        return this
    }

    GetCategoryTreeByType baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }

}
