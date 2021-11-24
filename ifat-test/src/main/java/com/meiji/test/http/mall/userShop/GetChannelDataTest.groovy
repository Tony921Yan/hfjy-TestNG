package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.GetChannelData
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/16-10:50
 @version v2.1
 */
class GetChannelDataTest extends BaseTest{
    GetChannelData getChannelData = new GetChannelData()
    @Test(description = "获取频道数据 getChannelData" ,groups = ["prod","uat"],testName = "getChannelData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelData(TestContext testContext){
        getChannelData.invoke(testContext).baseAssert(testContext)
    }
}