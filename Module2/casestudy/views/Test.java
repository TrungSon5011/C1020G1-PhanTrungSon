package views;

import commons.Capitalize;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        gender = Capitalize.capitalize(gender);
        System.out.println(gender);
    }
}
