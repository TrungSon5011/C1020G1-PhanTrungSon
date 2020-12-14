package C1020G1.java_collection_framework.bai_tap.luyen_tap_su_dung_list;

import java.util.Scanner;

public class Test {
    public static final ProductManager productManager = new ProductManager();
    public static Scanner scanner = new Scanner(System.in);
    public static int choose;
    public static void main(String[] args) {

        do{
            System.out.println("MENU");
            System.out.println("1. Add a product \n" +
                    "2. Edit information of product \n" +
                    "3. Delete product \n" +
                    "4. Display product \n" +
                    "5. Search product \n" +
                    "6. Sort product(price increase \n" +
                    "7. Exit");
            System.out.println("Enter your option");
            choose = scanner.nextInt();
            switch (choose){
                case 1: productManager.addProduct();
                break;
                case 2: productManager.editProduct();
                    break;
                case 3: productManager.deleteProduct();
                    break;
                case 4: productManager.displayProduct();
                    break;
                case 5: productManager.searchProduct();
                    break;
                case 6: productManager.sortProduct();
                    break;

                case 7: System.exit(7);
                default:
                    System.out.println("Wrong choose, enter again");
            }
        }
        while (true);
    }
}
