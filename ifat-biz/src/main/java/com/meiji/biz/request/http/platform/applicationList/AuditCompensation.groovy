package com.meiji.biz.request.http.platform.applicationList

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditCompensation extends PlatformPost {
    {
        super.api = "ApplicationList/auditCompensation"
        super.params =  [ "auditStuats","couponCode","couponId","couponName","feedBackUrl","message","orderId","payoutAmount","payoutType","checkUserId","checkUserName"]
    }

    AuditCompensation invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditCompensation preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditCompensation baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }


}
