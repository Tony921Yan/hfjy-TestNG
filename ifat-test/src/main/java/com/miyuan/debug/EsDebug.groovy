package com.miyuan.debug

import com.miyuan.service.EsService
import org.testng.annotations.Test

class EsDebug {
    @Test
    void test1(){
        List list = EsService.getItemByitemSourceId("630407291117")
        println(list)
    }

    @Test
    void test2(){
        List list = EsService.getItemByitemTitle("衣服")
        println(list)
    }
}
