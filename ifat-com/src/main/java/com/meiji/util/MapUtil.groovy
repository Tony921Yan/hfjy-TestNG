package com.meiji.util

import org.apache.commons.beanutils.BeanUtils

class MapUtil {
    static Map objToMap(Object obj){
        Map map = BeanUtils.describe(obj);
        map.remove("class");
        map.remove("metaClass")
        return map
    }
}