package com.roman.jwtwithspringsecurity.controller;

import com.roman.jwtwithspringsecurity.models.User;
import com.roman.jwtwithspringsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
