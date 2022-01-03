package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public String findAll(HttpServletRequest request, Model model) {
        List<User> users = userService.findAll();
        //        保存到作用域
        model.addAttribute("users", users);
        System.out.println("findAll ok");
        return "showAll";
    }

}
