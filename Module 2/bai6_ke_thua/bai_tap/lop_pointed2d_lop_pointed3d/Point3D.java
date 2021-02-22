package C1020G1.ke_thua.bai_tap.lop_pointed2d_lop_pointed3d;

public class Point3D extends Point2d {
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }


    public void setZ(float z){
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public float [] getXYZ(){
        float [] arrayOfXYZ = {getX(), getY(), getZ()};
        return arrayOfXYZ;
    }
    public String toString(){
        return "(x: "+getX()+", y: "+getY()+", z: "+getZ()+" )";
    }
}
