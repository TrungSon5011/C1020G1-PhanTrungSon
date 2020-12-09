package C1020G1.dsa_stack_queue.bai_tap.conver_number;

import java.util.Scanner;
import java.util.Stack;

public class Convert10To2 {
    public static String convertNum(int num){
        int remainder = 0;
        Stack<Integer> stack = new Stack<>();
        while (num != 0){
            remainder = num % 2;
            stack.push(remainder);
            num /= 2;
        }
        String binary = "";
        while (!stack.empty()){
            binary += stack.pop();
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = scanner.nextInt();
        System.out.println("Decimal number: "+number+" convert to binay number: "+convertNum(number));
    }
}
