package com.action;

import com.vo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@Controller
public class HelloController {

    //只能部署才tomcat里才能显示
    @RequestMapping("/")
    public String hello(){
        return "index";
    }

    @RequestMapping("/person")
    public String person(Model model){
        Person person=new Person();
        person.setAge(11);
        person.setName("张三");
        List<Person> list = new ArrayList<Person>();
        Person p1 = new Person("李四",4);
        Person p2=new Person("王五",5);
        list.add(p1);
        list.add(p2);
        model.addAttribute("singlePerson",person);
        model.addAttribute("personList",list);
        return "index2";
    }

}
