package C1020G1.ke_thua.bai_tap.lop_pointed2d_lop_pointed3d;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2d(){
    }
    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getX(){
        return this.x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return this.y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        float [] arrayOfXY = {this.x, this.y};
        return arrayOfXY;
    }
    public String toString(){
        return "X: "+this.x+", Y: "+this.y;
    }
}
