package com;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG="WORLD";

    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
