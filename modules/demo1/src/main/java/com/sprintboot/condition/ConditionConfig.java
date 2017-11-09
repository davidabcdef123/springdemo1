package com.sprintboot.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Super.Sun on 2017/11/2.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowListServce() {
        return new WindowListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxService(){
        return new LinuxListService();
    }
}
