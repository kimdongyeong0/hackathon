package com.hackaton.hackaton.controller;

import com.hackaton.hackaton.domain.User;
import com.hackaton.hackaton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class UserController{
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public UserController(){}

    @GetMapping("/sign-in")
    public void login(){
    }

    @PostMapping("/sign-in")
    public String login(long user_id, String user_pw){
        User foundUser = userService.findById(user_id);
        System.out.println("id : "+foundUser);
        return "redirect:/index";
    }

    @GetMapping("/sign-up")
    public void register(){}

    @PostMapping("/sign-up")
    public String registered(User user, RedirectAttributes redirectAttributes){
        //세션 User객체 저장

        return "redirect:/index";
    }
}