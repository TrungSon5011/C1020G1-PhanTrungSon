package C1020G1.abstract_class.bai_tap.interface_resizable;

import java.util.ArrayList;
import java.util.List;

public class SquareTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Square(5.8));
        shapes.add(new Rectangle(4.5,5.7));
//   Shape[] shapes = new Shape[3];
//   shapes[0] = new Circle(5.0);
//   shapes[1] = new Square(5.8);
//   shapes[2] = new Rectangle(4.5,5.7);
   Rectangle rectangle = new Rectangle(4.5,5.7);
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("The area original: "+shapes.get(i).getArea());
            ((Resizeable) shapes.get(i)).resize();
        }
//   for (Shape shape : shapes){
//       System.out.println("The area original: "+shape.getArea());
//       ((Resizeable) shape).resize();
//        }
    }
}
