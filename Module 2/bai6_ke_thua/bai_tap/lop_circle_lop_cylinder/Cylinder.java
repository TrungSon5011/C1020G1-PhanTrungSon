package C1020G1.ke_thua.bai_tap.lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height){
        super(9,"pink");
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getV(){
        return super.getArea()*this.height;
    }
    public String toString(){
        return "A cylinder width height: "+this.height+" and v: "+getV()+", which is a subclass of "+super.toString();
    }
}
