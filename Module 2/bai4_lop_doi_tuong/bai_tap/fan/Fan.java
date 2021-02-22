package C1020G1.lop_doi_tuong.bai_tap.fan;

public class Fan {
    final int LOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1 ;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }
    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return  this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public int setSpeed(int speed){
        return this.speed = speed;
    }
    public boolean setOn(boolean on){
        return this.on = on;
    }
    public double setRadius(double radius){
        return this.radius = radius;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String toString(){
        if(this.on == false){
            System.out.print("Fan is off, ");
        }else{
            System.out.print("Fan is on, ");
        }
        return "speed: "+ this.speed +", color: "+ this.color+ ", radius: "+this.radius;
    }
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(" "+fan.toString());
        Fan fan1 = new Fan(3,10,"yellow",true);
        fan1.setColor("pink");
        System.out.println(" "+fan1.toString());
        Fan fan2 = new Fan(2, 5, "blue",false);
        System.out.println(" "+fan2.toString());
    }


}
