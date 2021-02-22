package models;

public class Room extends Services {
    private String serviceFree;

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(){

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String id, String nameService, double square, double price, int maxPeople, String rentType, String serviceFree) {
        super(id, nameService, square, price, maxPeople, rentType);
        this.serviceFree = serviceFree;
    }

    @Override
    public String showInfo() {
        return "ID: "+getId()+ " " +
                ", Service Type: "+getNameService()+
                ", Square: "+getSquare()+
                ", Price: "+getPrice()+
                ", Max people: "+getMaxPeople()+
                ", Rent Type: "+getRentType()+
                ", Service free: "+this.serviceFree;
    }

    @Override
    public int compareTo(Services o) {
        return super.getNameService().compareTo(o.getNameService());
    }
}
