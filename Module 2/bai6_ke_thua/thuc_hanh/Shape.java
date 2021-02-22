package C1020G1.ke_thua.thuc_hanh;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        String fill ;
        if(this.filled){
            fill = "filled";
        }else{
            fill = "not filled";
        }
        return "A Shape with color of "+this.color+" and "+fill;
    }
}
