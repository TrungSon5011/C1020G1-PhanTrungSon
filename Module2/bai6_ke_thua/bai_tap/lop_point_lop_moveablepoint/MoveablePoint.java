package C1020G1.ke_thua.bai_tap.lop_point_lop_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        setXY(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float [] getSpeed(){
        float [] arrayOfSpeed = {this.xSpeed, this.ySpeed};
        return arrayOfSpeed;
    }
    public String move(){
        super.setX(getX()+this.xSpeed);
        super.setY(getY()+this.ySpeed);

        return "X: "+getX()+", Y: "+getY();
    }
    public String toString(){
        return "( "+getX()+", "+getY()+" ) , speed = ( "+getxSpeed()+", "+getySpeed()+" )";
    }
}
