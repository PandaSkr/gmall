package com.libin.gmalluser.controller;

import com.libin.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by libin on 2020/5/27
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello libin";
    }
}
