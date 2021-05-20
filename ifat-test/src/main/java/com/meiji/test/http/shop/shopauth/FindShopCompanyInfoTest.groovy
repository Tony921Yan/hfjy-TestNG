package com.meiji.test.http.shop.shopauth

import com.meiji.biz.request.http.shop.shopauth.FindShopCompanyInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopCompanyInfoTest extends BaseTest {
    FindShopCompanyInfo findShopCompanyInfo = new FindShopCompanyInfo()
    @Test(description = "查询店铺企业信息 findShopCompanyInfo" ,groups = ["prod","uat"],testName = "findShopCompanyInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopCompanyInfo(TestContext testContext){
        findShopCompanyInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}