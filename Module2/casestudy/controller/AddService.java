package controller;

import commons.FileUtils;
import commons.Validate;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.FileReader;
import java.util.*;

import static controller.MainController.displayMainMenu;


public class AddService {
    static int choose;
    static String id;
    static String nameService;
    static String square ;
    static String price;
    static String maxPeople;
    static String rentType;
    static String line;

    static List<Room> roomList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Villa> villaList = new ArrayList<>();
    public static final String FILE_HOUSE = "src/data/House.csv";
    public static final String FILE_VILLA = "src/data/Villa.csv";
    public static final String FILE_ROOM = "src/data/Room.csv";
    public static final String COMMON = ",";
    public static void addNewService(){
        do {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1: addNewVilla();break;
                case 2: addNewHouse();break;
                case 3: addNewRoom();break;
                case 4: displayMainMenu();break;
                case 5: System.exit(5);
            }
        }while (true);
    }


    private static void addService(Services service){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name service: ");
        nameService = scanner.nextLine();
        while (!Validate.isName(nameService)){
            System.out.println("Invalid, enter name service again: ");
            System.out.println("Enter name service: ");
            nameService = scanner.nextLine();
        }
        System.out.println("Enter Square(>30 m2) : ");
        try {
            square = scanner.nextLine();
            while (!Validate.isArea(square)){
                System.out.println("Enter Square again (> 30m2): ");
                square = scanner.nextLine();
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Enter price: ");
        price = scanner.nextLine();
        while (!Validate.checkPrice(price)){
            System.out.println("Enter price: ");
            price = scanner.nextLine();
        }
        System.out.println("Enter max people: ");
        maxPeople = scanner.nextLine();
        while (!Validate.isPeople(maxPeople)){
            System.out.println("Enter max people again: ");
            maxPeople = scanner.nextLine();
        }
        System.out.println("Enter rent type(Xy): ");
        rentType = scanner.nextLine();
        while (!Validate.isName(rentType)){
            System.out.println("Enter rent type again(Xy) : ");
            rentType = scanner.nextLine();
        }
//        service.setId(id);
//        service.setNameService(nameService);
//        service.setSquare(square);
//        service.setPrice(price);
//        service.setMaxPeople(maxPeople);
//        service.setRentType(rentType);
    }

    private static void addNewRoom() {
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID(SVRO-XXXX): ");
        id = scanner.nextLine();
        while (!Validate.isIdRoom(id)){
            System.out.println("Enter ID again(SVRO-XXXX): ");
            id = scanner.nextLine();
        }
        addService(room);
        System.out.println("Enter service free: ");
        String serviceFree = scanner.nextLine();
//        room.setServiceFree(serviceFree);
//        roomList.add(room);
        line = id + COMMON + nameService +COMMON + square + COMMON + price +COMMON + maxPeople +COMMON +
        rentType +COMMON + serviceFree;
        FileUtils.writeFile(FILE_ROOM,line);
    }
    private static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("Enter id(SVHO-XXXX): ");
        id = scanner.nextLine();
        while (!Validate.isIdHouse(id)){
            System.out.println("wrong!");
            System.out.println("Enter id(SVHO-XXXX): ");
            id = scanner.nextLine();
        }
        addService(house);
        System.out.println("Enter room standard(Xy): ");
        String roomStandard = scanner.nextLine();
        while (!Validate.isName(roomStandard)){
            System.out.println("Enter room standard(Xy): ");
            roomStandard = scanner.nextLine();
        }
        System.out.println("Enter other: ");
        String other = scanner.nextLine();
        System.out.println("Enter floor: ");
        String floor = scanner.nextLine();
        while (!Validate.isFloor(floor)){
            System.out.println("Enter floor again: ");
            floor = scanner.nextLine();
        }

//        house.setRoomStandard(roomStandard);
//        house.setOther(other);
//        house.setFloor(floor);
        houseList.add(house);
        line = id + COMMON + nameService + COMMON +square + COMMON + price +COMMON + maxPeople +COMMON +
                rentType +COMMON + roomStandard +COMMON +other + COMMON + floor;
        FileUtils.writeFile(FILE_HOUSE,line);
    }
    private static void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("Enter id(SVVL-XXXX): ");
        id = scanner.nextLine();
        while (!Validate.isIdVilla(id)){
            System.out.println("Enter id(SVVL-XXXX): ");
            id = scanner.nextLine();
        }
        addService(villa);
        System.out.println("Enter room standard(Xy): ");
        String roomStandard = scanner.nextLine();
        while (!Validate.isName(roomStandard)){
            System.out.println("Enter room standard again(Xy): ");
            roomStandard = scanner.nextLine();
        }
        System.out.println("Enter swimming pool square(>30 m2): ");
        String poolSquare = scanner.nextLine();
        while (!Validate.isArea(poolSquare)){
            System.out.println("Enter swimming pool square(>30 m2): ");
            poolSquare = scanner.nextLine();
        }
        System.out.println("Enter other: ");
        String other = scanner.nextLine();
        System.out.println("Enter floor: ");
        String floor = scanner.nextLine();
        while (!Validate.isFloor(floor)){
            System.out.println("Enter floor again: ");
            floor = scanner.nextLine();
        }
//        villa.setRoomStandard(roomStandard);
//        villa.setPoolArea(poolSquare);
//        villa.setOther(other);
//        villa.setFloor(floor);
//        villaList.add(villa);
        line = id + COMMON + nameService + COMMON +square + COMMON + price +COMMON + maxPeople +COMMON +
                rentType +COMMON + roomStandard +COMMON +other +COMMON +poolSquare + COMMON + floor;
        FileUtils.writeFile(FILE_VILLA,line);
    }
}
