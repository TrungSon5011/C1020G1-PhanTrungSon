package com.example.controller;

import com.example.bean.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping({"","/search"})
    public String findWord(@RequestParam String englishWord,Model model){
        Map<String,String> dictionaryMap = Dictionary.dictionaryMap;
        String vietWord = null;
        for (String key: dictionaryMap.keySet()){
            if(englishWord.equalsIgnoreCase(key)){
                vietWord = dictionaryMap.get(key);
                break;
            }
        }
        if(vietWord == null){
            vietWord = "Hoi kho qua";
        }
        model.addAttribute("vietWord",vietWord);
        model.addAttribute("englishWord",englishWord);
        return "result";
    }
}
