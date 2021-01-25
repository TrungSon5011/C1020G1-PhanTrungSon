package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> showProduct();

    void create(Product product);

    Product findByName(String name);
    Product findById(int id);

    void update(int index,Product product);

    void remove(int id);
    int getIndex(int id);
}
