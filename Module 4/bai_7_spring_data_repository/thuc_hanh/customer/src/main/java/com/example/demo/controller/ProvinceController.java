package com.example.demo.controller;

import com.example.demo.model.Province;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @GetMapping("/province")
    public String provinceList(Model model){
        model.addAttribute("provinces",provinceService.findAll());
        return "province_list";
    }
    @GetMapping("/province/create")
    public String createForm(Model model){
        model.addAttribute("province",new Province());
        return "province_create";
    }
    @PostMapping("/province/save")
    public String create(Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @GetMapping("/province/{id}/edit")
    public String editForm(Model model, @PathVariable Integer id){
        model.addAttribute("province",provinceService.findById(id));
        return "province_edit";
    }
    @PostMapping("/province/edit")
    public String edit(Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @GetMapping("/province/{id}/delete")
    public String deleteForm(Model model,@PathVariable Integer id){
        model.addAttribute("province",provinceService.findById(id));
        return "province_delete";
    }
    @PostMapping("/province/delete")
    public String delete(Province province){
        provinceService.remove(province);
        return "redirect:/province";
    }
    @GetMapping("/province/{id}/view")
    public String view(Model model,@PathVariable Integer id){
        model.addAttribute("province",provinceService.findById(id));
        return "province_view";
    }

}
