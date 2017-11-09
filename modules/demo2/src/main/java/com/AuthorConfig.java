package com;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@Component
@ConfigurationProperties(prefix = "author",locations = {"classpath:author.properties"})
public class AuthorConfig {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
