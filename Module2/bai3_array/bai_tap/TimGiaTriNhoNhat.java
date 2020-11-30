package C1020G1.Array.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Enter elements for the array: ");
        for(int i = 0; i < size;i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for(int j = 1; j < array.length;j++){
            if(min > array[j]){
                min = array[j];
            }
        }
        System.out.println("Minimum element of the array: "+min);
    }
}
