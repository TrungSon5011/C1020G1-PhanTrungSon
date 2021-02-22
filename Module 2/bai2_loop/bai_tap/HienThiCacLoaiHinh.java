package C1020G1.Loop.BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2. Print the square triangle " +
                "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Choose your option: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){
            case 1: printRectangle();
            case 2: printSquareTriangle();
            case 3:printIsoscelesTriangle();
            case 4:
        }
    }
    public static void printRectangle(){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 8;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printSquareTriangle(){
        for(int i = 0; i < 5;i++){
            for(int j = i;j >= 0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0;i < 5;i++){
            for(int j = i; j < 5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0;i < 5;i++){
            for(int j = i; j > 0;j--){
                System.out.print(" ");
            }
            for(int r = i; r < 5;r++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0;i < 5;i++){
            for(int j = i+1; j < 5;j++){
                System.out.print(" ");
            }
            for(int r = i; r >= 0; r--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printIsoscelesTriangle(){
        for(int i=0;i < 5;i++){
            for(int j=i;j < 5;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
