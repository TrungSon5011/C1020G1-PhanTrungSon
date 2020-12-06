package C1020G1.ke_thua.bai_tap.thiet_ke_trien_khai_lop_triangle;

public class Shape {
    private String color = "green";
    public Shape(){
    }
    public Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "a Shape with color of "+this.color;
    }
}
