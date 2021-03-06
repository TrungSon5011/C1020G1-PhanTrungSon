package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    @RequestMapping({"","/save"})
    public String save(@RequestParam(value = "condiments", required = false) String [] condiment , Model model){
        model.addAttribute("condiments",condiment);
        return "/result";
    }
}
