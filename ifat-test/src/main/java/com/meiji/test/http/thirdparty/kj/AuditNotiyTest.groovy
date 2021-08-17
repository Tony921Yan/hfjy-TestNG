package com.meiji.test.http.thirdparty.kj
import com.meiji.biz.request.http.thirdparty.kj.AuditNotiy
import com.meiji.biz.util.DateUtil
import com.meiji.biz.util.KJSign
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import groovy.xml.XmlParser
import org.testng.annotations.Test

class AuditNotiyTest extends BaseTest{
    AuditNotiy auditNotiy = new AuditNotiy()
    @Test(description = "跨境商品订单审核通知 auditNotiy" ,groups = ["debug"],testName = "debug",
            dataProvider = "common",dataProviderClass = TestData.class)
    public void debug(TestContext testContext){
        XmlParser xmlParser = new XmlParser()
        String userCode = "T2020"
        def data = "<request>" +
                "<kjCustomerOutstoreReturn>" +
                "<saleOrderCode>O2021081715100129391</saleOrderCode>" +
                "<logisticsCode>美记测试</logisticsCode>" +
                "<logisticsNumber>1234567890</logisticsNumber>" +
                "<markPlace1>大头笔或集包地</markPlace1>" +
                "<markPlace2>大头笔或三段码</markPlace2>" +
                "<outstoreStatus>31</outstoreStatus>" +
                "<outstoreStatusMsg>仓库无库存</outstoreStatusMsg>" +
                "<occurTime>"+  DateUtil.dateToStr(new Date()) +"</occurTime>" +
                "</kjCustomerOutstoreReturn>" +
                "</request>"
        String msgData = Base64.getEncoder().encodeToString(data.getBytes("UTF-8"))
        String msgDigest = KJSign.sign(msgData)
        testContext.put("msgType","KJ_CUSOMER_OUTSTORE_RETURN")
        testContext.put("userCode",userCode)
        testContext.put("msgId",UUID.randomUUID().toString())
        testContext.put("msgData",msgData)
        testContext.put("msgDigest",msgDigest)
        auditNotiy.invoke(testContext)
    }
}
