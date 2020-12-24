package C1020G1.regex.bai_tap.validate_phone;

import java.util.Scanner;

public class ValidatePhone {
    private static final String PHONE_REGEX = "^[(][\\d]{2}[)]-[(][\\d]{10}[)]$";

    public static void main(String[] args) {
        System.out.println("Enter phone number");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        if(phone.matches(PHONE_REGEX)){
            System.out.println("phone is valid");
        }else {
            System.out.println("Invalid phone number");
        }
    }
}
