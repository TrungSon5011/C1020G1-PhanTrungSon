package C1020G1.ke_thua.bai_tap.thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2 of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3 of the triangle: ");
        double side3 = scanner.nextDouble();
        System.out.println("Enter color of the triangle: ");
        scanner.nextLine();
        String color = scanner.nextLine();
        System.out.println(color);
        Triangle triangle1 = new Triangle(side1, side2, side3, color);
        System.out.println(triangle1);
    }
}
