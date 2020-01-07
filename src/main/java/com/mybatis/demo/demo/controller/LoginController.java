package com.mybatis.demo.demo.controller;

import com.mybatis.demo.demo.service.LoginService;
import com.mybatis.demo.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestParam("userName") String userName,@RequestParam("password") String password){

        return loginService.login(userName,password);
    }


}
