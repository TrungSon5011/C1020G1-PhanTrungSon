package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    List<Blog> findAll();
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Blog blog);
    List<Blog> findByTitleContaining(String title);
    Page<Blog> findByTitleContaining(String title,Pageable pageable);
}
