package C1020G1.abstract_class.bai_tap.interface_resizable;

import java.util.Random;

public class Square extends Shape implements Resizeable {
    private double side;
    public Square(double side){
        this.side = side;
    }
    public String howToColor(){
        return " Color all four sides";
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public void resize() {
        Random generator = new Random();
        System.out.println("The area after resize: "+this.side*(generator.nextInt(99)+1));

    }

}
