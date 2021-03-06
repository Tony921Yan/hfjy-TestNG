package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.QueryGoodPropertysByPage
import org.testng.annotations.Test

class QueryGoodPropertysbyPageTest extends BaseTest {
    QueryGoodPropertysByPage queryGoodPropertysByPage = new QueryGoodPropertysByPage()
    @Test(description = "商品属性分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertysByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertysByPage(TestContext testContext){
        queryGoodPropertysByPage.invoke(testContext).baseAssert(testContext)
    }
}