package controller;

import java.util.Scanner;


import static controller.AddService.addNewService;

public class MainController {
    static int choose;

    public static void displayMainMenu(){

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1: Add new service");
            System.out.println("2: Show service ");
            System.out.println("3. Add customer");
            System.out.println("4: Show information of customer ");
            System.out.println("5: Add new booking");
            System.out.println("6: Show information of employee");
            System.out.println("7: Exit");
            System.out.println("Your option: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1: addNewService();break;
                case 2: ShowService.showService();break;
                case 3: Customer.addCustomer();break;
                case 4: Customer.showInformationCustomer();break;
                case 5: NewBooking.addNewBooking();break;
                case 6: ShowEmployee.showEmployee();break;
                case 7: System.exit(7);
            }
        }while (true);
    }
    public static void main(String[] args) {
    displayMainMenu();
    }
}
