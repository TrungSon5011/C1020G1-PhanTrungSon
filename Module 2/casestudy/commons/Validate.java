package commons;

import commons.exception.BirthdayException;
import commons.exception.EmailException;
import commons.exception.IdCardException;
import commons.exception.NameException;

import java.util.Scanner;

public class Validate {
    private static String regex = "";
    // regex tieng viet ([\p{Lu}][\p{Ll}]{0,8})(\s([\p{Lu}]|[\p{Lu}][\p{Ll}]{1,10})){1,10}$;
    public static boolean isIdService(String str){
        regex = "^SVVL|SVHO|SVRO-[\\d]{4}$";
        return str.matches(regex);
    }
    public static boolean isIdVilla(String str){
        regex = "^SVVL-\\d{4}$";
        return str.matches(regex);
    }
    public static  boolean isIdHouse(String str){
        regex = "^SVHO-\\d{4}$";
        return str.matches(regex);
    }
    public static boolean isIdRoom(String str){
        regex = "^SVRO-\\d{4}";
        return str.matches(regex);
    }
    public static boolean isServiceName(String str){
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }
    public static boolean isArea(String str){
//        regex = "^[3-9][0-9]|[1-9]\\d{2}$";
        regex = "[3-9][0-9]+[.]?[0-9]|[1-9][0-9]{2,}[.]?[0-9]|[3-9][0-9]*";
        return str.matches(regex);
    }
    public static boolean checkPrice(String str){
        regex = "^[1-9][0-9]*$";
        return str.matches(regex);
    }
    public static boolean isPeople(String str){
        regex = "^([1-9]|([1][0-9]))$";
        return str.matches(regex);
    }

    public static boolean isNameSerive(String str){
        regex = "^(massage|karaoke|food|drink|car)$";
        return str.matches(regex);
    }
    public static boolean isFloor(String str){
        regex = "^([1-9]+[0-9]*)$";
        return str.matches(regex);
    }
    public static boolean isName(String str){
        regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        return str.matches(regex);
    }
    public static String validateNameCustomer(String str){
        regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!str.matches(regex)){
                try {
                    throw new NameException("Invalid name of customer!!");
                } catch (NameException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter name of customer again(Xyy Xyy): ");
                str = scanner.nextLine();
            }else {
                break;
            }
        }
        return str;
    }
    public static String validateEmail(String str){
//        regex = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
        regex = "^\\w{3,}@[a-zA-Z]{3,5}\\.[a-zA-Z]{3}$";
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!str.matches(regex)){
                try {
                    throw new EmailException("Invalid email(abc@abc.com");
                } catch (EmailException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Enter email");
                str = scanner.nextLine();
            }else {
                break;
            }
        }
        return str;
    }

//    public static void main(String[] args) {
//        String str = "abc@abc.coa";
//        System.out.println(str.matches("^\\w{3,}@[a-zA-Z]{3,5}\\.[a-zA-Z]{2,3}$"));
//    }
    public static boolean isGender(String str){
        regex = "^(male|female|Male|Female)$";
        return str.matches(regex);
    }
    public static String validateIDCard(String str){
//        regex = "^\\d{9}$";
        Scanner scanner = new Scanner(System.in);
        regex = "[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}";
        while (true){
            if(!str.matches(regex)){
                try {
                    throw new IdCardException("Invalid ID");
                } catch (IdCardException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Enter ID(XXX XXX XXX): ");
                }
                str = scanner.nextLine();
            }else {
                break;
            }
        }
        return str;
    }
    public static String validateBirthDay(String str){
        regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!str.matches(regex)){
                try {
                    throw new BirthdayException("Invalid birthday!!");
                } catch (BirthdayException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Enter birthday(dd/mm/yyyy): ");
                }
                str = scanner.nextLine();
            }else {
                break;
            }
        }
        return str;
    }

}
