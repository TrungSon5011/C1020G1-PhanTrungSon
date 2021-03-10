package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class BlogRestController {
    @Autowired
    BlogService blogService;
    @GetMapping("blog/search/{text}")
    ResponseEntity<List<Blog>> search(@PathVariable String text){
        System.out.println(text);
       List<Blog> blogs = blogService.findByTitleContaining(text);
       if(blogs == null){
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity<>(blogs,HttpStatus.OK);
    }

    @GetMapping("/list")
    ResponseEntity<Page<Blog>> listBlog(@PageableDefault(size = 1)Pageable pageable){
        Page<Blog> blogs = blogService.findAll(pageable);
        if(blogs == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }
}
