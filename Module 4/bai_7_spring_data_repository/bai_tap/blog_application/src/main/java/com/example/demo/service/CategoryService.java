package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Integer id);
    void save(Category category);
    void remove(Category category);
    Page<Category> findAll(Pageable pageable);
}
