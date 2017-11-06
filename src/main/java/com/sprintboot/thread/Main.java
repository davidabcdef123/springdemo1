package com.sprintboot.thread;

import com.sprintboot.thread.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Super.Sun on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }
}
