package C1020G1.dsa_stack_queue.bai_tap.palidroma;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalidrome(String str){
        Queue queue = new LinkedList();
        boolean test  = false;
        for(int i = str.length()-1;i >= 0;i--){
            queue.add(str.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString += queue.remove();
        }
        if(str.equals(reverseString)){
            test = true;
        }
        return test;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check palidrome: ");
        String string = scanner.nextLine();
        if(isPalidrome(string)){
            System.out.println("String is a palidrome");
        }else{
            System.out.println("String is NOT a palidrome");
        }
    }
}
