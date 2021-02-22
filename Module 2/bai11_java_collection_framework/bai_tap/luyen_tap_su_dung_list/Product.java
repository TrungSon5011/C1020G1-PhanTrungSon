package C1020G1.java_collection_framework.bai_tap.luyen_tap_su_dung_list;

public class Product  {
    private int id ;
    private String name;
    private String productInformation;
    private int price;

    public Product(int id, String name,String productInformation, int price) {
        this.id = id;
        this.name = name;
        this.productInformation = productInformation;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productInformation='" + productInformation + '\'' +
                ", price=" + price +
                '}';
    }

}
