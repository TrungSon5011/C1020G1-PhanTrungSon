package commons;

import java.util.Scanner;

public class Capitalize {
    public static String capitalize(String line) {
        line = line.toLowerCase();
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(capitalize(str));

    }
}
