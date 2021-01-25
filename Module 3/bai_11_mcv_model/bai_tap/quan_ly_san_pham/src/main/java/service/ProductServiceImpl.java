package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add( new Product(1,"iphone",1000,"phone","apple"));
        productList.add( new Product(2,"Galaxy",1500,"phone","samsung"));
        productList.add(new Product(3,"bphone",100,"phone","boom"));
        productList.add(new Product(4,"sex toy",99,"toy","great"));
    }
    @Override
    public List<Product> showProduct() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().equals(name)){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                return productList.get(i);
            }
        }
        return productList.get(id);
    }

    @Override
    public void update(int index,Product product) {

        productList.set(index,product);
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                productList.remove(i);
            }
        }
    }
    public int getIndex(int id){
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
