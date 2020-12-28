package controller;

import commons.Capitalize;
import commons.FileUtils;
import commons.Validate;
import commons.exception.GenderException;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private final static String FILEPATH_CUSTOMER = "src/data/Customer.csv";
    private final static String COMMON = ",";
    public static void addCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        name = Validate.validateNameCustomer(name);
        System.out.println("Enter birhtday: ");
        String dateOfBirth = scanner.nextLine();
        dateOfBirth = Validate.validateBirthDay(dateOfBirth);
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        gender = Capitalize.capitalize(gender);
        while (!Validate.isGender(gender )){
            System.out.println("invalid gender");
            System.out.println("Enter gender: ");
            gender = scanner.nextLine();
            gender = Capitalize.capitalize(gender);
        }

        gender = Capitalize.capitalize(gender);
        System.out.println("Enter ID number: ");
        String idNum = scanner.nextLine();
        idNum = Validate.validateIDCard(idNum);
        System.out.println("Enter phone number");
        String phoneNum = scanner.nextLine();

        System.out.println("Enter the email:");
        String email = scanner.nextLine();
        email = Validate.validateEmail(email);
        System.out.println("Enter Customer type:");
        String customerType = scanner.nextLine();
        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        models.Customer customer = new models.Customer(name,dateOfBirth,gender,idNum,phoneNum,email,customerType);
        String line = name + COMMON + dateOfBirth + COMMON + gender + COMMON +idNum + COMMON +phoneNum+ COMMON +email+
                COMMON + customerType;
        FileUtils.writeFile(FILEPATH_CUSTOMER,line);
    }
    public static void showInformationCustomer(){
        List<String> listLine = FileUtils.readFile(FILEPATH_CUSTOMER);
        Collections.sort(listLine);
        for (int i = 0; i < listLine.size(); i++) {
            System.out.println(listLine.get(i));
        }

    }
}
