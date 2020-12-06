package C1020G1.ke_thua.thuc_hanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double length){
        super("green", false);
        this.width = width;
        this.length = length;
    }
    public void setWidth (double width){
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth(){
        return this.width ;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getParameter(){
        return (this.length+ this.width)*2;
    }
    public String toString(){
        return "A Rectangle with width= "+this.width+" and length= "+this.length+", which is a subclass of "+super.toString();
    }
}
