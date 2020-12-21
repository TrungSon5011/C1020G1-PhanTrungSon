package C1020G1.xu_ly_ngoai_le.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the triangle: ");
       try {
           System.out.println("a = ");
           int sideA = scanner.nextInt();
           System.out.println("b = ");
           int sideB = scanner.nextInt();
           System.out.println("c = ");
           int sideC = scanner.nextInt();
           checkTriangle(sideA,sideB,sideC);
       }catch (InputMismatchException | IllegalTriangleException exception){
           System.out.println("Side input is illegally");
           scanner.nextLine();
       }
        System.out.println("done");
    }
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if(a + b <= c || a + c <= b || b + c <= a ){
            throw new IllegalTriangleException();
        }else if(a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangleException();
        }else {
            System.out.println("suitable");
            System.exit(0);
        }
    }
}
