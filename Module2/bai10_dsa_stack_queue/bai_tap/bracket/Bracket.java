package C1020G1.dsa_stack_queue.bai_tap.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if(character == '('){
                stack.push(character);
            }else if(character == ')'){
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math expression: ");
        String string = scanner.nextLine();
        if(checkBracket(string)){
            System.out.println("well");
        }else{
            System.out.println("NOT well");
        }
    }
}
