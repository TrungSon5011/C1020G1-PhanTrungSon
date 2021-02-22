package commons;

public class ServiceAdd {
    private String serviceAddName;
    private double single;
    private double totalPrice;

    public ServiceAdd(String serviceAddName, double single, double totalPrice) {
        this.serviceAddName = serviceAddName;
        this.single = single;
        this.totalPrice = totalPrice;
    }

    public String getServiceAddName() {
        return serviceAddName;
    }

    public void setServiceAddName(String serviceAddName) {
        this.serviceAddName = serviceAddName;
    }

    public double getPrice() {
        return single;
    }

    public void setPrice(double single) {
        this.single = single;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
