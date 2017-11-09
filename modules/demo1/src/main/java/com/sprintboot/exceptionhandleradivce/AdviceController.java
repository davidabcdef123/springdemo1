package com.sprintboot.exceptionhandleradivce;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Super.Sun on 2017/11/8.
 */
public class AdviceController {

    @RequestMapping()
    public String getSomeThing(@ModelAttribute("msg")String msg,Object object) throws IllegalAccessException {
        throw new IllegalAccessException("error");

    }
}
