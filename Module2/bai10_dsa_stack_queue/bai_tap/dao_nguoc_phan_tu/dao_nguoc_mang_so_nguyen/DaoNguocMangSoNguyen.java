package C1020G1.dsa_stack_queue.bai_tap.dao_nguoc_phan_tu.dao_nguoc_mang_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static int[] reverseStack(int [] arr){
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
    public static String reverseString(String str){
        Stack<String> strings = new Stack<>();
        String [] word = str.split("\\s");
        for (int i = 0; i < word.length; i++) {
            strings.push(word[i]);
        }
        String stringReverse = "";
        while (!strings.empty()){
            stringReverse += strings.pop()+ " ";
        }
//        str = stringReverse;
        return stringReverse;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("Array original: "+ Arrays.toString(array));
        reverseStack(array);
        System.out.println("Array after reverse: "+Arrays.toString(array));
        String string = "I am working";
        System.out.println("String original: "+string);
        System.out.println("String after reverse: "+reverseString(string));
    }
}
