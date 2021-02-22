package C1020G1.regex.bai_tap.valide_lop_hoc;

import java.util.Scanner;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        System.out.println("Enter Class name: ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        System.out.println(className.matches(CLASS_REGEX));
    }
}
