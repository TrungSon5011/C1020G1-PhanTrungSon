package models;

public abstract class Services implements Comparable<Services> {
    private String id;
    private String nameService;
    private double square;
    private double price;
    private int maxPeople;
    private String rentType;

    public Services() {
    }

    public Services(String id, String nameService, double square, double price, int maxPeople, String rentType) {
        this.id = id;
        this.nameService = nameService;
        this.square = square;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
    public abstract String showInfo();
}
