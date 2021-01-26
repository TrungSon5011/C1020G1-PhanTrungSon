package service;

import model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
    int getSize();
}
