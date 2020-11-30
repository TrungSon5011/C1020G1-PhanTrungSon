package C1020G1.Introduction.ThucHanh;

import java.util.Scanner;

public class SuDungToanTu {
        public static void main(String[] args) {
            float width;
            float height;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter width: ");
            width = scanner.nextFloat();

            System.out.println("Enter height: ");
            height = scanner.nextFloat();
            System.out.print("The Area: "+width*height);
        }

}
