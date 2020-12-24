package C1020G1.binary_file.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    private String id ;
    private  String productName;
    private String brand;
    private double price;
    private String other;
    private static final String FILE_PATH = "src/C1020G1/binary_file/bai_tap/quan_ly_san_pham/product.csv";

    public Product() {
    }

    public Product(String id, String productName, String brand, double price, String other) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.other = other;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", ProductName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }

    public static void addProduct(){
        List<Product> productList = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = null;
            do{
                product = (Product) objectInputStream.readObject();
                productList.add(product);
            }
            while (product != null);
        }
        catch (EOFException e){
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of the product: ");
        String productName = scanner.nextLine();
        System.out.println("Enter the brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the other information: ");
        String other = scanner.nextLine();
        Product productNew = new Product(id,productName,brand,price,other);
        productList.add(productNew);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            for (int i = 0; i < productList.size(); i++) {
                objectOutputStream.writeObject(productList.get(i));
            }
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void showProduct(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = null;
            do{
                product = (Product) objectInputStream.readObject();
                System.out.println(product.toString());
            }
            while (product != null);

        }
        catch (EOFException e){
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String searchProduct(String id){
        List<Product> productList = new ArrayList<>();
        String line = "";

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Product product = (Product) objectInputStream.readObject();
            while (product != null){
                productList.add(product);
                product = (Product) objectInputStream.readObject();
            }
        }catch (EOFException e) {

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < productList.size(); i++) {
            if(id.equals(productList.get(i).getId())){
                line = productList.get(i).toString();
            }
        }
        return line;
    }

    public static void main(String[] args) {
        do {
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. show product");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.println(" Enter your choose number: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1: addProduct();break;
                case 2: showProduct();break;
                case 3:
                    System.out.println("Enter id of the product: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    System.out.println(searchProduct(id));
                    break;
                case 4: System.exit(4);break;
            }
        }while (true);
    }
}
