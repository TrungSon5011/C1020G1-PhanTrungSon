package C1020G1.thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;
import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j <= i) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements: ");
            array[i] = scanner.nextInt();
        };
        System.out.println("Array before sort: "+Arrays.toString(array));
        System.out.println("Array after sort: "+Arrays.toString(insertionSort(array)));
    }



}
