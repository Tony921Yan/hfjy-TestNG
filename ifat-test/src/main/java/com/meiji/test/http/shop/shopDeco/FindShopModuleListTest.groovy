package com.meiji.test.http.shop.shopDeco
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.shopDeco.FindShopModuleList
import org.testng.annotations.Test

class FindShopModuleListTest extends BaseTest {
    FindShopModuleList findShopModuleList = new FindShopModuleList()
    @Test(description = "查询店铺首页模块列表 findShopModuleList" ,groups = ["prod","uat"],testName = "findShopModuleList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleList(TestContext testContext){
        findShopModuleList.invoke(testContext).baseAssert(testContext)
    }
}
