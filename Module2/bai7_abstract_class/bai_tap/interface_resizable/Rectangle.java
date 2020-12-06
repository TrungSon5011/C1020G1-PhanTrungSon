package C1020G1.abstract_class.bai_tap.interface_resizable;

import java.util.Random;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double length){
        super("green", false);
        this.width = width;
        this.length = length;
    }
    public void setWidth (double width){
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth(){
        return this.width ;
    }
    public double getLength(){
        return this.length;
    }
    @Override
    public double getArea(){
        return this.length*this.width;
    }
    public double getParameter(){
        return (this.length+ this.width)*2;
    }
    public String toString(){
        return "A Rectangle with width= "+this.width+" and length= "+this.length+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize() {
        Random generator = new Random();
        System.out.println("The area after resize: "+getArea()*(generator.nextInt(99)+1));
    }
}
