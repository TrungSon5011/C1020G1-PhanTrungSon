package C1020G1.java_collection_framework.bai_tap.luyen_tap_su_dung_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ProductManager  {
    private Product product;
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public ProductManager() {
    }

    public ProductManager(Product product) {
        this.product = product;
    }

    public  void addProduct(){
        int id = (productList.size() > 0) ? (productList.size() +1) : 1;
        scanner.nextLine();
        System.out.println("Enter name of product: ");
//        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter information of product: ");
        String productInformation = scanner.nextLine();
        System.out.println("Enter the price of the product: ");
        int price = scanner.nextInt();
        Product product = new Product(id,name,productInformation,price);
        productList.add(product);
        System.out.println("Done");
    }
    public <E> void editProduct(){
        System.out.println("Enter the id of product you need to edit information: ");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                System.out.println("Edit information of the product: ");
                String informationEdit = scanner.nextLine();
                productList.get(i).setProductInformation(informationEdit);
            }
        }
    }
    public void deleteProduct(){
        System.out.println("Enter id of the product you need to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id ){
                productList.remove(i);
            }
        }
        System.out.println("Done");
    }
    public void displayProduct(){
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }
    }
    public void searchProduct(){
        System.out.println("Enter the name of product to search: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        int test = 0;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().equals(name)){
                System.out.println("Product you search"+productList.get(i).toString());
                test = 1;
                }
            }
        if(test == 0){
            System.out.println("There is not the product which you search");
        }
    }
    public void sortProduct(){
        ProductSortByPrice productSortByPrice = new ProductSortByPrice();
        Collections.sort(productList, productSortByPrice);
        displayProduct();
    }
}
