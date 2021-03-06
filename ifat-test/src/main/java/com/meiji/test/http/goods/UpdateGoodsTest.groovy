package com.meiji.test.http.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.BrandDetail
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    BrandDetail brandDetail = new BrandDetail()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void brandDetail(TestContext testContext){
        brandDetail.invoke(testContext).baseAssert(testContext)
    }
}