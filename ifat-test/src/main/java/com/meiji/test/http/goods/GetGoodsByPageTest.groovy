package com.meiji.test.http.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.goods.GetGoodsByPage
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage getGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品列表 getGoodsByPage" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-categoryId为空" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage_categoryIdNull(TestContext testContext){
        testContext.put("categoryId",null)
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}
