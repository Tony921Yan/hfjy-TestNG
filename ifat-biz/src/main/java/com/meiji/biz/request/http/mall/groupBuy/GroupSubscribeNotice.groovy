package com.meiji.biz.request.http.mall.groupBuy
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GroupSubscribeNotice extends MallPost{
    {
        super.api = "active/getRecommendGroupGoods"
       super.params = ["beginTime","shopId","spuId","activityId"]
    }

    GroupSubscribeNotice invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GroupSubscribeNotice preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GroupSubscribeNotice baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
