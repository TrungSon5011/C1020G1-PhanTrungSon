package C1020G1.Array.BaiTap;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row and column of the matrix: ");
        int rows = scanner.nextInt();
//        System.out.println("Enter column of the matrix: ");
        int cols = rows;
        double [][] matrix = new double[rows][cols];
        double sum  = 0;
        for(int i = 0; i < rows;i++){
            System.out.println("Enter the elements of row "+i+": ");
            for(int j = 0;  j < matrix[i].length;j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }
        int n = 0;
        while (n < rows ){
           sum += matrix[n][n];
           n++;
        }
        System.out.println(sum);
    }
}
