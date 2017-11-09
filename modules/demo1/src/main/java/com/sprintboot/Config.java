package com.sprintboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("com.sprintboot")
public class Config {
}
