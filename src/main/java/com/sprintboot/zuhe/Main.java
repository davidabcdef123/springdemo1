package com.sprintboot.zuhe;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Super.Sun on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SuperConfiguration.class);
        DemoService demoService=context.getBean(DemoService.class);
        demoService.demoService();
    }
}
