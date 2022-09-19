package org.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//2.定义controller
//2.1使用@Controller定义bean

@Controller
public class USerController {


    //设置当前访问路径
    @RequestMapping("/save")
    //设置当前操作的 返回值类型、
    @ResponseBody
    public String save(String name,int age){
        System.out.println(name+age);
        System.out.println("user save");
        return "{'module':'springmvc啊'}";
    }
    @RequestMapping("/dwg")
    @ResponseBody
    public User listParamForJson(@RequestBody List<String> likes){
        User user = new User();
        user.setName("wang1");
        user.setAge("12");
        System.out.println(likes);
        System.out.println(user);
        return user;
    }
}
