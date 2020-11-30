package C1020G1.Array.BaiTap;

import java.util.Scanner;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[7];
        int [] array12 = new int[array1.length+ array2.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers for array 1: ");
        for(int i = 0; i < array1.length;i++){
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter numbers for array 2: ");
        for(int i = 0; i < array2.length;i++){
            array2[i] = scanner.nextInt();
        }
        int index = 0;
        for(int i = 0; i < array1.length;i++){
            array12[index++] = array1[i];
        }
        for(int j = 0;j < array2.length;j++){
            array12[index++] = array2[j];
        }
        System.out.println("Array 1: "+Arrays.toString(array1));
        System.out.println("Arrays 2: "+Arrays.toString(array2));
        System.out.println("The new array: "+Arrays.toString(array12));
    }
}
