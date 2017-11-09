package com;

/**
 * Created by Super.Sun on 2017/11/8.
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "hello"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
