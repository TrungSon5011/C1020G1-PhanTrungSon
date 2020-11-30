package C1020G1.Array.BaiTap;

import java.util.Scanner;
import java.util.Arrays;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int [] array = {1,2,3,34,546,76,434,12};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add: ");
        int addNum = scanner.nextInt();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        if(index <= 1 || index > array.length -1){
            System.out.println("Cant not to add number into the array");
        }else{
            for(int i = array.length-1; i > index;i--){
                array[i] = array[i -1];
            }
            array[index] = addNum;
        }
        System.out.println("The new array: "+Arrays.toString(array));
    }
}
