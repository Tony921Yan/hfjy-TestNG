package com.meiji.biz.request.http.OMS.order
import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetOrderEventLog extends OMSGet {
    {
        super.api = "/api/supplier/orderMgr/getOrderEventLog"
        super.params =  [ "supplierId","orderCode"]

    }

    OMSGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}