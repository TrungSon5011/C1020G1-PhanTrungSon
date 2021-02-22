package C1020G1.lop_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        LopHinhChuNhat lopHinhChuNhat = new LopHinhChuNhat(width, height);
        System.out.println("Your rectangle: "+ lopHinhChuNhat.display());
        System.out.println("The area: "+ lopHinhChuNhat.getArea());
        System.out.println("The parameter: "+lopHinhChuNhat.getParameter());
    }
}
