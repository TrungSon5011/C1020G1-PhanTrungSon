package C1020G1.Introduction.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Enter amount of money(USD): ");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        System.out.print("Amount of money( VND): "+usd*23000);
    }
}
