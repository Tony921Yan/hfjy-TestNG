package com.meiji.biz.request.http.platform.activeMainManage.giftAdvManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class ToggleStatus extends PlatformPost{
    {
        super.api = "GiftAdvManage/toggleStatus"
        super.params = ["id","isDisable"]
    }

    ToggleStatus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ToggleStatus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ToggleStatus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    ToggleStatus specialAssert(TestContext testContext){
        Integer mysqlResult = MysqlService.getToggleStatus(testContext.get("id"))
        assert mysqlResult != testContext.get("isDisable") //数据库：`status`  '1 开启  0禁用'；接口 1禁用，0开启
        return this
    }


}
