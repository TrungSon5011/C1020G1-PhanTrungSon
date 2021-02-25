package com.example.controller;

import com.example.model.Login;
import com.example.model.User;
import com.example.repository.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home","login",new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }
        return new ModelAndView("user","user",user);
    }
}
