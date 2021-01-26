package repository;

import model.Product;

import java.util.List;

public interface ProductReposetory {
    void save(Product product);
    List<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
    int getSize();
}
