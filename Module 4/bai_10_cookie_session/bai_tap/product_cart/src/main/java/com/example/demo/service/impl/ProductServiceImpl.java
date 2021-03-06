package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
    public Double calculateTotalPrice(Map<Product,Integer> cart){
        Double totalPrice = 0.0;
        for(Map.Entry<Product,Integer> list : cart.entrySet()){
            totalPrice += list.getKey().getPrice()*list.getValue();
        }
        return totalPrice;
    }
}
