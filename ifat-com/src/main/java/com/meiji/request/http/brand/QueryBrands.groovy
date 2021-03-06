package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class QueryBrands extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.BrandMgrService"  //接口路径
        super.methodName="queryBrands"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.meiji.common.bean.vo.PageReqVO"] //请求参数
        super.params = [["pageIndex","pageSize","queryCondition"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
