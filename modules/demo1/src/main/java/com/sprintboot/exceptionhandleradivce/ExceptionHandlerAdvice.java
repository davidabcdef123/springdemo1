package com.sprintboot.exceptionhandleradivce;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

/**
 * Created by Super.Sun on 2017/11/6.
 */
//全局变量
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttrubit(Model model){
        model.addAttribute("msg","额外全局消息");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");

    }
}
