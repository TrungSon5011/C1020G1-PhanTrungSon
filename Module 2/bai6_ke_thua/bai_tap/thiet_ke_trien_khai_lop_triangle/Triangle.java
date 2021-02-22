package C1020G1.ke_thua.bai_tap.thiet_ke_trien_khai_lop_triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color){
        setColor(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    private double getParimeterHalf(){
//        (a+b+c)/2;
        return (side1+side2+side3)/2;
    }
    public double getParimeter(){
        return getParimeterHalf()*2;
    }
    public double getArea(){
//        Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return Math.sqrt(getParimeterHalf()*(getParimeterHalf()-side1)*(getParimeterHalf()-side2)*(getParimeterHalf()-side3));
    }
    public String toString(){
        return checkTriangle() ? "Side 1: "+this.side1+", side 2: "+this.side2+", side 3: "+this.side3+"\nThe parameter: "
                +getParimeter()+"\nThe area: "+getArea()+"\nThe color: "+super.getColor()
                :"side1: "+this.side1+", side2; "+this.side2+", side3: "+this.side3+" are not sides of the triangle";
    }
    private boolean checkTriangle(){
        boolean test = false;
        if( this.side1 < this.side2 + this.side3 && this.side2 < this.side1 + this.side3 && this.side3 < this.side2 + this.side1){
            test = true;
        }
        return test;
    }
}
