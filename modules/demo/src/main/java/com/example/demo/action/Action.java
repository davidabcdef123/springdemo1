package com.example.demo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Super.Sun on 2017/11/10.
 */
@Controller
public class Action {

    @RequestMapping("a")
    public String dd(){
        return "index";
    }
}
