package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController  // 等价于 = @Controller + @ResponseBody 作用：将controller中所有的方法的返回值都转化为json进行响应
@RequestMapping("demo")
public class DemoController {
    @RequestMapping("demo")
    @ResponseBody // 将方法返回值转化为json格式
    public String demo() {
        System.out.println("demo ok ");
        return "demo ok!";
    }

    @RequestMapping("index")
    public String index() {
        System.out.println("index ok ");
        return "index";
    }
}
