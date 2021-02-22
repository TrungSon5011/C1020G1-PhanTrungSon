package C1020G1.regex.thuc_hanh.validate_account;

import java.util.Scanner;

public class ValidateAccount {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account");
        String account = scanner.nextLine();
        System.out.println(account.matches(ACCOUNT_REGEX));
    }
}
