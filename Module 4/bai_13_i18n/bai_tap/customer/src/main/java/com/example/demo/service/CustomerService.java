package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Integer id);
    void save(Customer customer);
    void remove(Customer customer);
    Page<Customer> findAll(Pageable pageable);
    List<Customer> findByNameContaining(String name);
}
