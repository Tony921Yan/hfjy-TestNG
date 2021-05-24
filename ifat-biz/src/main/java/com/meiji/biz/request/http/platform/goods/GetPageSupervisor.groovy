package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetPageSupervisor extends PlatformGet{
    {
        super.api = "/platform/goodsMgr/getPageSupervisor"
        super.params = []
    }

    PlatformGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
