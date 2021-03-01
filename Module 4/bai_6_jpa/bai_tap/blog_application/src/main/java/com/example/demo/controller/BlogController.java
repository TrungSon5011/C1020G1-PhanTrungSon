package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping({"","/blog"})
    public String listBlog(Model model){
        model.addAttribute("blog",blogService.findAll());
        return "list";
    }
    @GetMapping("/blog/create")
    public String createForm(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }
    @PostMapping("/blog/save")
    public String create(Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("/blog/{id}/delete")
    public String deleteForm(Model model, @PathVariable Integer id){
        model.addAttribute("blog",blogService.findById(id));
        return "delete";
    }
    @PostMapping("/blog/delete")
    public String delete(Blog blog){
        blogService.remove(blog);
        return "redirect:/";
    }
    @GetMapping("/blog/{id}/view")
    public String view(@PathVariable Integer id,Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "view";
    }
    @GetMapping("/blog/{id}/edit")
    public String editForm(@PathVariable Integer id,Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "edit";
    }
    @PostMapping("/blog/edit")
    public String edit(Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }

}
