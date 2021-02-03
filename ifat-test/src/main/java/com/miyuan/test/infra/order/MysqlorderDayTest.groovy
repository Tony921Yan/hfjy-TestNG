package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.MysqlDbOrderList
import org.testng.annotations.Test

class MysqlorderDayTest extends BaseTest{
    MysqlDbOrderList mysqldbOrderList = new MysqlDbOrderList()
    //更改测试用例
    @Test(description = "核对oms_com_income_item,oms_com_income_item_day与MongoDB的数据" ,groups = ["prod","prod"],testName = "dayItem",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void MysqlorderResultlist(TestContext testContext){

        // item表某天汇总
        mysqldbOrderList.dayCountAssert(testContext)
    }


        }







