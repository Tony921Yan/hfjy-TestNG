package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.AddShopModule
import org.testng.annotations.Test

class AddShopModuleTest extends BaseTest {
    AddShopModule addShopModule = new AddShopModule()
    @Test(description = "新增店铺首页模块 addShopModule" ,groups = ["prod","uat"],testName = "addShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addShopModule(TestContext testContext){
        addShopModule.invoke(testContext).baseAssert(testContext)
    }
}
