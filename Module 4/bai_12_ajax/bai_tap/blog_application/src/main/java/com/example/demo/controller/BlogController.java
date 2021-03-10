package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping({"","/blog"})
    public String listBlog(Model model, @PageableDefault(size = 5,sort = "writeDate")Pageable pageable){
        model.addAttribute("blog",blogService.findAll(pageable));
        return "list";
    }
    @GetMapping("/blog/create")
    public String createForm(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("category",categoryService.findAll());
        return "create";
    }
    @PostMapping("/blog/save")
    public String create(Blog blog){
        blog.setWriteDate(LocalDate.now());
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
        model.addAttribute("category",categoryService.findAll());
        return "edit";
    }
    @PostMapping("/blog/edit")
    public String edit(Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
//    @ResponseBody
//    @GetMapping("/list")
//    Page<Blog> listBlog(@PageableDefault(size = 1)Pageable pageable){
//        Page<Blog> blogs = blogService.findAll(pageable);
//        return blogs;
//    }
//    @GetMapping("/blog/search")
//    public String findByTitle(@RequestParam String title,Model model,@PageableDefault(size = 1,sort = "writeDate")Pageable pageable){
//        model.addAttribute("blog",blogService.findByTitleContaining(title,pageable));
//        return "search";
//    }
}
