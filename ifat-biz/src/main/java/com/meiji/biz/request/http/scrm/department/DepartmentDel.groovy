package com.meiji.biz.request.http.scrm.department

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-13:54
 */
class DepartmentDel extends ScrmPost{
    {
        super.api = "scrm/department/delete"
        super.params = ["id",
                        "level"]
    }
}
