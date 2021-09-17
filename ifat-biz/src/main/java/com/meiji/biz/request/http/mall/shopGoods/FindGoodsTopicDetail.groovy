package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FindGoodsTopicDetail extends MallPost {
    {
        super.api = "/shopGoods/findGoodsTopicDetail"
        super.params =  [ "page","rows","priceSort","publishTimeSort","salesSort","comprehensiveSort","shopId","topicPageId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}