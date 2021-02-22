package C1020G1.Array.BaiTap;

import java.util.Scanner;

public class MaxOnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of the matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter column of the matrix: ");
        int cols = scanner.nextInt();
        double [][] matrix = new double[rows][cols];
        double max  = matrix[0][0];
        int rowIndex = 0;
        int colIndex = 0;
        for(int i = 0; i < rows;i++){
            System.out.println("Enter the elements of row "+i+": ");
            for(int j = 0;  j < matrix[i].length;j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("Max: "+max);
        System.out.println("index of max: ["+rowIndex+"]["+colIndex+"] ");
    }
}
