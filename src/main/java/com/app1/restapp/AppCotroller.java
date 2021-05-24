package com.app1.restapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class AppCotroller {
    @Autowired
    private UserRepository repo;
    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
    @GetMapping("signUpForm.html")
    public String showSignUpForm(Model model){
        model.addAttribute("user",new User());
        return "signup_form";
    }

    @PostMapping("register_success.html")
    public String processRegistration(User user1){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String encodePassword=encoder.encode(user1.getPassword());
        user1.setPassword(encodePassword);

        repo.save(user1);

        return "Reegister suuccess";

    }
    @GetMapping("userss.html")
    public String ViewUsersList(Model model){
        List<User> listUsers=repo.findAll();
        model.addAttribute("listUsers",listUsers);
        return "userss";
    }
}
