package com.sprintboot.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Super.Sun on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        System.out.println(listService.showListCmd());
    }
}
