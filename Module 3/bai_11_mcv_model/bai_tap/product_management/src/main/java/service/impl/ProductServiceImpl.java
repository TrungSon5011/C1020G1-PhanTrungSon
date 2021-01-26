package service.impl;

import model.Product;
import repository.ProductReposetory;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductReposetory productReposetory = new ProductRepositoryImpl();
    @Override
    public void save(Product product) {
        productReposetory.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productReposetory.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productReposetory.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        productReposetory.deleteById(id);
    }

    @Override
    public int getSize() {
        return productReposetory.getSize();
    }

}
