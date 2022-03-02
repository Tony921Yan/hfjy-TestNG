package com.meiji.biz.request.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class DeleteActive extends PlatformPost{
    {
        super.api="grantCouponActive/deleteActive"
        super.params = ["id"]
    }

    DeleteActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}