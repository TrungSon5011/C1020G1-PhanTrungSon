package C1020G1.Array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int [] array = {1,2,35,6,34,65,34,23};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you want to remove from the array: ");
        int elem = scanner.nextInt();
        int index = -1;
        for(int i = 0; i < array.length;i++){
            if(elem == array[i]){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("dont have "+elem+" on the array");
        }else{
            for(int i = index; i < array.length-1;i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            System.out.println("the new array: "+ Arrays.toString(array));
        }

    }

}
