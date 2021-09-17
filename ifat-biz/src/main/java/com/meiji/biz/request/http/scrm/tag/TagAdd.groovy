package com.meiji.biz.request.http.scrm.tag

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/17-15:50
 */
class TagAdd extends ScrmPost{
    {
        super.api = "scrm/tag/add"
        super.params = ["groupId",
                        "groupName",
                        "name",
                        "tagId",
                        "tagIds",
                        "tagNames"]
    }
}
