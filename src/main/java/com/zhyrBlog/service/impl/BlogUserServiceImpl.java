package com.zhyrBlog.service.impl;

import com.zhyrBlog.model.mapper.BlogUserMapper;
import com.zhyrBlog.model.pojo.BlogUser;
import com.zhyrBlog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanyr
 * datetime: 15-6-9 下午1:37
 * introduction
 */
@Service
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    private BlogUserMapper blogUserMapper;
    public int addUser(BlogUser blogUser) {
        return blogUserMapper.insert(blogUser);
    }
}
