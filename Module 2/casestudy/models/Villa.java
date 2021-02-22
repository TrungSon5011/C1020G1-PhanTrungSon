package models;

public class Villa extends Services {
    private String roomStandard;
    private String other;
    private double poolArea;
    private int floor;


   public Villa(){
   }

    public Villa(String roomStandard, String other, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.other = other;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id, String nameService, double square, double price, int maxPeople, String rentType, String roomStandard, String other, double poolArea, int floor) {
        super(id, nameService, square, price, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.other = other;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "ID: "+getId()+ " " +
                ", Service Type: "+getNameService()+
                ", Square: "+getSquare()+
                ", Price: "+getPrice()+
                ", Max people: "+getMaxPeople()+
                ", Rent Type: "+getRentType()+
                ", Room Standard: "+this.roomStandard+
                ", Pool area : "+this.poolArea+
                ", Other: "+this.other+
                ", Floor: "+this.floor;
    }

    @Override
    public int compareTo(Services o) {
        return super.getNameService().compareTo(o.getNameService());
    }


}
