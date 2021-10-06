package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveManage extends PlatformPost {
    {
        super.api = "ActiveManage/queryActiveByPage"
        super.params =  [ "pageNum","pageSize"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost specicalAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
    }
}