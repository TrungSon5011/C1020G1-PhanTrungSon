package C1020G1.xu_ly_ngoai_le.thuc_hanh.array_index_bound_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer [] createRandom(){
        Random random = new Random();
        Integer [] array = new Integer[100];
        System.out.println("Elements of the array: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

}
