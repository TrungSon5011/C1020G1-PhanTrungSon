package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("user",new User());
        return "form";
    }
    @PostMapping("/")
    public String checkValidation(@Valid User user, BindingResult bindingResult,Model model){
        new User().validate(user,bindingResult);
        if(bindingResult.hasErrors()){
            return "form";
        }else {
            model.addAttribute("user",user);
            return "result";
        }
    }
}
