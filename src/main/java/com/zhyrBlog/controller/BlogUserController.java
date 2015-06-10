package com.zhyrBlog.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;

/**
 * Created by zhanyr
 * datetime: 15-6-9 下午2:39
 * controller
 */
@Controller
@RequestMapping("/")
public class BlogUserController {
    private Logger logger = LoggerFactory.getLogger(BlogUserController.class);
    @RequestMapping("index")
    public String index(){
        logger.error("访问index页面....");
        return "index";
    }
}
