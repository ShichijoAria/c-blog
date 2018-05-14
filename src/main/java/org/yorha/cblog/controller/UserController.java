package org.yorha.cblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yorha.cblog.Entity.UserEntity;
import org.yorha.cblog.dao.UserMapper;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login_page")
    public String userLogin() {
        return "index";
    }


    @GetMapping("/")
    public String allIndex(){
        return "index";
    }

}
