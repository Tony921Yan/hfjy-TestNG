package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.FlowPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FlowPageQueryTest extends BaseTest {
    FlowPageQuery flowPageQuery = new FlowPageQuery()
    @Test(description = "获取月度流水记录 flowPageQuery" ,groups = ["prod","uat"],testName = "flowPageQuery1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void flowPageQuery(TestContext testContext){
        flowPageQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
