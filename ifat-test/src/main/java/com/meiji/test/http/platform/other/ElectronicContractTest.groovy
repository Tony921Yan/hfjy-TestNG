package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.ActiveManage
import com.meiji.biz.request.http.platform.other.ElectronicContract
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ElectronicContractTest extends BaseTest {
    ElectronicContract electronicContract = new ElectronicContract()
    @Test(description = "合同管理 electronicContract" ,groups = ["prod","uat"],testName = "electronicContract",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void electronicContract(TestContext testContext){
        electronicContract.invoke(testContext).baseAssert(testContext)
        electronicContract.specialAssert(testContext)
    }
}
