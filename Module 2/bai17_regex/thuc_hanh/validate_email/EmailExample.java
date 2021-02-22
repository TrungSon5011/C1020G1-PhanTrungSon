package C1020G1.regex.thuc_hanh.validate_email;

import java.util.Scanner;

public class EmailExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email =  scanner.nextLine();
        System.out.println(EmailRegex.checkEmail(email));
    }
}
