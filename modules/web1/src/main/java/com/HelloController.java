package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@Controller
public class HelloController {

    //只能部署才tomcat里才能显示
    @RequestMapping("/")
    public String hello(){
        return "index";
    }
}
