package com.blb.controller;

import com.blb.pojo.UserInfo;
import com.blb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public UserInfo queryUserByid(@PathVariable("id") Long i){
        UserInfo user=userService.queryUserByid(i);
        return user;
    }
}
