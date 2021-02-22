package C1020G1.abstract_class.bai_tap.interface_colorable;

public class Circle extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPirameter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius= " + this.radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public String howToColor() {
        return "i got it";
    }
}
