package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopGoodsStateList extends MallPost {
    {
        super.api = "/shopGoods/findShopGoodsStateList"
        super.params =  ["shopId","skuIdList"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindShopGoodsStateList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopGoodsStateList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopGoodsStateList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopGoodsStateList specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getBrand(testContext.get("id"))
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert  DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
        return this
    }
}
