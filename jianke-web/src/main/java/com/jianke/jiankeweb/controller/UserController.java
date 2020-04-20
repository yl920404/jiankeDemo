package com.jianke.jiankeweb.controller;

import com.jianke.jiankeservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUserName")
    public  String getUserName (Integer userId){
        return userService.getUserNameById(userId);
    }
}
