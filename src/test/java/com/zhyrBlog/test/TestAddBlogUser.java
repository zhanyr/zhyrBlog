package com.zhyrBlog.test;

import com.zhyrBlog.model.pojo.BlogUser;
import com.zhyrBlog.service.BlogUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhanyr
 * datetime: 15-6-9 下午1:42
 * introduction
 */
public class TestAddBlogUser {

    private BlogUserService blogUserService;
    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        blogUserService = (BlogUserService) context.getBean("blogUserServiceImpl");
    }

    @Test
    public void addBlogUser(){
        BlogUser user = new BlogUser();
        user.setUsername("zhanyaru");
        user.setPassword("12345678");
        System.out.println(blogUserService.addUser(user));
    }
}
