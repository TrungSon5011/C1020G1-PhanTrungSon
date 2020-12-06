package C1020G1.ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String toString(){
        return "A cirle with radius "+this.radius+", color: "+this.color+" and the area: "+getArea();
    }
}
