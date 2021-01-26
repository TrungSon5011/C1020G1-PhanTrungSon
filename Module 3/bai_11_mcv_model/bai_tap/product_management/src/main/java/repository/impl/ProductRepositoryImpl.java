package repository.impl;

import model.Product;
import repository.ProductReposetory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements ProductReposetory {
    static Map<Integer,Product> productMap = new TreeMap<>();
    static {
        productMap.put(1,new Product(1,"iphone",1000,"phone","apple"));
        productMap.put(2,new Product(2,"Galaxy",1500,"phone","samsung"));
        productMap.put(3,new Product(3,"bphone",100,"phone","boom"));
        productMap.put(4,new Product(4,"sex toy",99,"toy","great"));
    }
    @Override
    public void save(Product product) {
        if(product.getId() == null  ){

        }else {
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(Integer id) {
        return productMap.get(id);
    }

    @Override
    public void deleteById(Integer id) {
        productMap.remove(id);
    }

    @Override
    public int getSize() {
        return productMap.size();
    }
}
