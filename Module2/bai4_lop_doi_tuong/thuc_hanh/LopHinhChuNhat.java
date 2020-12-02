package C1020G1.lop_doi_tuong.thuc_hanh;

public class LopHinhChuNhat {
    double width, height;
    public LopHinhChuNhat(){

    }
    public LopHinhChuNhat(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getParameter(){
        return (this.height+ this.width)*2;
    }
    public String display(){
        return "Rectangle{"+"width "+ width+ "height "+height+"}";
    }
}
