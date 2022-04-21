package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetSeckillTopGoods
import com.miyuan.ifat.support.annotation.Data
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2022/04/20-10:50
 @version v2.7.1
 */
class GetSeckillTopGoodsTest extends BaseTest{
    GetSeckillTopGoods getSeckillTopGoods = new GetSeckillTopGoods()
    @Test(description = "首页三个秒杀商品 getSeckillTopGoods" ,groups = ["prod","uat"],dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    @Data(dataFile = "mall/active/getSeckillTopGoods.xml",testName = "getSeckillTopGoods",commonFile = "common.xml")
    public void getSeckillTopGoods(TestContext testContext){
        getSeckillTopGoods.invoke(testContext).baseAssert(testContext)
    }
}
