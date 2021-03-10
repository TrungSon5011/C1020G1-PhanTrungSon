package com.example.demo.service;

import com.example.demo.model.Smartphone;

import java.util.List;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    Smartphone remove(Integer id);
}
