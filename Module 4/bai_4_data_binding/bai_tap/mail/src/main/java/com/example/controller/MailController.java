package com.example.controller;

import com.example.model.Mail;
import com.example.service.MailService;
import com.example.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailController {
    @Autowired
    private MailService mailService ;
    @GetMapping("/mail")
    public String getForm(Model model){
        model.addAttribute("mail",mailService.getMail());
        List listLanguage = new ArrayList();
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");
        model.addAttribute("languages",listLanguage);
        List size = new ArrayList();
        size.add(5);
        size.add(10);
        size.add(15);
        size.add(25);
        size.add(50);
        size.add(100);
        model.addAttribute("size",size);
        return "form";
    }
    @PostMapping("/update")
    public String updateForm(Model model, @ModelAttribute Mail mail){
        model.addAttribute("mail",mail);
        return "show_form";
    }
}
