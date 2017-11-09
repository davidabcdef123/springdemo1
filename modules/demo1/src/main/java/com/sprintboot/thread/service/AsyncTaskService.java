package com.sprintboot.thread.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Super.Sun on 2017/11/2.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("plus:"+i);

    }
}
