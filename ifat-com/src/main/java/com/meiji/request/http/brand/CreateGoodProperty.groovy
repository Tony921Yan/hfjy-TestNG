package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.factory.MeijiRequest

class CreateGoodProperty extends MeijiRequest{
    {
        super.api = "/platform/goodPropertyMgr/createGoodProperty";
        super.params = [["createBy","gmtCreate","goodPropertyValues","id","isMust",
                         "isSearch","name","remark","status","type","updateBy"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MeijiRequest specialAssert(TestContext testContext){

    }

}
