package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageAdd extends PlatformPost{
    {
        super.api = "ActiveMainManage/add"
       super.params = ["expiryEnd","expiryStart","name","preTime","remark","secKillActivity","status","type"]
    }

    ActiveMainManageAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManageAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveMainManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}