package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@SpringBootApplication
public class StartController {

    public static void main(String[] args) {
        //1
        SpringApplication.run(StartController.class);
        //2
        //SpringApplication app=new SpringApplication(StartController.class);
        //app.setShowBanner(false);
        //app.run(args);
        //3
        //new SpringApplicationBuilder(StartController.class).showBanner(false).run(args);
    }
}
