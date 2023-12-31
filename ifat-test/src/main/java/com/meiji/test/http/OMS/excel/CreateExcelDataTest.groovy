package com.meiji.test.http.OMS.excel

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.OMS.excel.CreateExcelData
import org.testng.annotations.Test

class CreateExcelDataTest extends BaseTest {
    CreateExcelData createExcelData = new CreateExcelData()
    @Test(description = "批量插入数据 createExcelData" ,groups = ["prod","uat"],testName = "createExcelData",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createExcelData(TestContext testContext){
        createExcelData.invoke(testContext).baseAssert(testContext)
    }
}
