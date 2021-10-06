package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.FindShopCustomerGroupByShopId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopCustomerGroupByShopIdTest extends BaseTest {
    FindShopCustomerGroupByShopId findShopCustomerGroupByShopId = new FindShopCustomerGroupByShopId()
    @Test(description = "店铺群设置 findShopCustomerGroupByShopId" ,groups = ["prod","uat"],testName = "findShopCustomerGroupByShopId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopCustomerGroupByShopId(TestContext testContext){
        testContext.put("id",1405981112139808)
        findShopCustomerGroupByShopId.invoke(testContext).baseAssert(testContext)
    }
}
