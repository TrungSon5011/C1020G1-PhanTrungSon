package C1020G1.abstract_class.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable {
    public String howToColor(){
        return " Color all four sides";
    }

    @Override
    public double getArea() {
        return 0;
    }

}
