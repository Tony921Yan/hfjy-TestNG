package com.miyuan.service

import com.miyuan.api.RedisAPI

class RedisService extends RedisAPI {

    static Object get(String key){
        Object value = jedisCluster.get("dddd")
        return value
    }
    static def getcommis(String key){
        def value = jedisClusterIfatTest.get(key)
        return value
    }

}
