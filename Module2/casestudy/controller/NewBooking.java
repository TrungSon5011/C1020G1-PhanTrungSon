package controller;

import commons.FileUtils;
//import jdk.swing.interop.SwingInterOpUtils;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewBooking {
    private static int choose;
    private final static String FIlE_PATH_CUSTOMER = "src/data/Customer.csv";
    private final static String FIlE_PATH_BOOKING = "src/data/Booking.csv";
    private final static String FIlE_PATH_BOOKING_VILLA = "src/data/Bookingvilla.csv";
    private final static String FIlE_PATH_BOOKING_HOUSE = "src/data/Bookinghouse.csv";
    private final static String FIlE_PATH_BOOKING_ROOM = "src/data/Bookingroom.csv";
    public static final String FILE_HOUSE = "src/data/House.csv";
    public static final String FILE_VILLA = "src/data/Villa.csv";
    public static final String FILE_ROOM = "src/data/Room.csv";
    public static String lineCustomer = "";
    public static String lineVilla = "";
    public static String lineHouse = "";
    public static String lineRoom = "";
    public static String lineBooking = "";
    public final static String COMMA = ",";
    public static void addNewBooking(){
        List<String> customerList = FileUtils.readFile(FIlE_PATH_CUSTOMER);
        System.out.println("Customer list: ");
        int i = 0;
        for(String customer : customerList){
            System.out.println(i + ". "+customer);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index : ");
        int j = scanner.nextInt();
        lineCustomer = customerList.get(j);
        System.out.println("-----------------------");
        do{
            System.out.println("1. Booking villa");
            System.out.println("1. Booking house");
            System.out.println("1. Booking room");
            System.out.println("4. Menu");
            System.out.println("5. Exit");
            choose = scanner.nextInt();
            switch (choose){
                case 1: bookingVilla();break;
                case 2: bookingHouse();break;
                case 3: bookingRoom();break;
                case 4: MainController.displayMainMenu();break;
                case 5: System.exit(5);
            }
        }while (true);
    }

    private static void bookingRoom() {
        List<String> roomList = FileUtils.readFile(FILE_ROOM);
        Collections.sort(roomList);
        int i = 0;
        System.out.println("Room list: ");
        for(String room : roomList){
            System.out.println(i +". "+room);
            i++;
        }
        System.out.println("Enter the index: ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        lineRoom = roomList.get(j);
        lineBooking = lineCustomer + COMMA + lineRoom;
        FileUtils.writeFile(FIlE_PATH_BOOKING,lineBooking);
        System.out.println("Updated!");
    }

    private static void bookingHouse() {
        List<String> houseList = FileUtils.readFile(FILE_HOUSE);
        Collections.sort(houseList);
        int i = 0;
        System.out.println("House list: ");
        for(String house : houseList){
            System.out.println(i +". "+house);
            i++;
        }
        System.out.println("Enter the index: ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        lineHouse = houseList.get(j);
        lineBooking = lineCustomer + COMMA + lineHouse;
        FileUtils.writeFile(FIlE_PATH_BOOKING,lineBooking);
        System.out.println("Updated!");
    }

    private static void bookingVilla() {
        List<String> villaList = FileUtils.readFile(FILE_VILLA);
        Collections.sort(villaList);
        int i = 0;
        System.out.println("Villa list: ");
        for(String villa : villaList){
            System.out.println(i +". "+villa);
            i++;
        }
        System.out.println("Enter the index: ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        lineVilla = villaList.get(j);
        lineBooking = lineCustomer + COMMA + lineVilla;
        FileUtils.writeFile(FIlE_PATH_BOOKING,lineBooking);
        System.out.println("Updated!");
    }

}
