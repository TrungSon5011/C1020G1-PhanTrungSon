package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    BlogService blogService;
    @GetMapping({"/category"})
    public String listCategory(Model model, @PageableDefault(size = 5)Pageable pageable){
        model.addAttribute("category",categoryService.findAll(pageable));
        return "category_list";
    }
    @GetMapping("/category/create")
    public String createForm(Model model){
        model.addAttribute("category",new Category());
        return "category_create";
    }
    @PostMapping("/category/save")
    public String create(Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/category/{id}/delete")
    public String deleteForm(Model model, @PathVariable Integer id){
        model.addAttribute("category",categoryService.findById(id));
        return "category_delete";
    }
    @PostMapping("/category/delete")
    public String delete(Category category){
        categoryService.remove(category);
        return "redirect:/category";
    }
    @GetMapping("/category/{id}/view")
    public String view(@PathVariable Integer id,Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "category_view";
    }
    @GetMapping("/category/{id}/edit")
    public String editForm(@PathVariable Integer id,Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "category_edit";
    }
    @PostMapping("/category/edit")
    public String edit(Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
}
