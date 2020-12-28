package controller;

import commons.FileUtils;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static controller.MainController.displayMainMenu;

public class ShowService {
    private static final String FILE_HOUSE = "src/data/House.csv";
    private static final String FILE_VILLA = "src/data/Villa.csv";
    private static final String FILE_ROOM = "src/data/Room.csv";
    private static String id;
    private static String nameService;
    private static String square;
    private static String price;
    private static String maxPeople;
    private static String rentType;


    public static void showService(){
         int choose = 0;
        do {
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show all name Villa not duplicate");
            System.out.println("5. Show all name House not duplicate");
            System.out.println("6. Show all name room not duplicate");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose){
                case 1: showAllVilla();break;
                case 2: showAllHouse();break;
                case 3: showAllRoom();break;
                case 4: showVillaNotDupliate();break;
                case 5: showHouseNotDuplicate();break;
                case 6: showRoomNotDuplicate();break;
                case 7: displayMainMenu();break;
                case 8: System.exit(8);
            }


        }while (true);
    }

    private static void showRoomNotDuplicate() {
        List<String> roomList = FileUtils.readFile(FILE_ROOM);
        TreeSet<Room> roomTreeSet = new TreeSet<>();
        for (int i = 0; i < roomList.size(); i++) {
            String [] temp = roomList.get(i).split(",");
            id = temp[0];
            nameService = temp[1];
            square = temp[2];
            price = temp[3];
            maxPeople = temp[4];
            rentType = temp[5];
            String serviceFree = temp[6];
            Room roomAdd = new Room(id,nameService,Double.parseDouble(square),Double.parseDouble(price),Integer.parseInt(maxPeople),rentType,serviceFree);
//            room.add(roomAdd);
            roomTreeSet.add(roomAdd);
        }
        for(Room room1 : roomTreeSet){
            System.out.println(room1.showInfo());
        }
        MainController.displayMainMenu();
    }

    private static void showHouseNotDuplicate() {
        List<String> houseList = FileUtils.readFile(FILE_HOUSE);
//        List<House> houses = new ArrayList<>();
        TreeSet<House> houseTreeSet = new TreeSet<>();
        for (int i = 0; i < houseList.size(); i++) {
            String [] temp = houseList.get(i).split(",");
            id = temp[0];
            nameService = temp[1];
            square = temp[2];
            price = temp[3];
            maxPeople = temp[4];
            rentType = temp[5];
            String roomStandard = temp[6];
            String other = temp[7];
            String floor = temp[8];
            House house = new House(id,nameService,Double.parseDouble(square),Double.parseDouble(price),Integer.parseInt(maxPeople),rentType,
                    roomStandard,other,Integer.parseInt(floor));
            houseTreeSet.add(house);
        }
        for(House house: houseTreeSet){
            System.out.println(house.showInfo());
        }
        MainController.displayMainMenu();
    }

    private static void showVillaNotDupliate() {
        List<String> villaList = FileUtils.readFile(FILE_VILLA);
        TreeSet<Villa> villaTreeSet = new TreeSet<>();
        for (int i = 0; i < villaList.size(); i++) {
            String [] temp = villaList.get(i).split(",");
            id = temp[0];
            nameService = temp[1];
            square = temp[2];
            price = temp[3];
            maxPeople = temp[4];
            rentType = temp[5];
            String roomStandard = temp[6];
            String other = temp[7];
            String poolArea = temp[8];
            String floor = temp[9];
            Villa villa = new Villa(id,nameService,Double.parseDouble(square),Double.parseDouble(price),
                    Integer.parseInt(maxPeople),rentType,roomStandard,other,Double.parseDouble(poolArea),Integer.parseInt(floor));
            villaTreeSet.add(villa);
        }
        for(Villa villa: villaTreeSet){
            System.out.println(villa.showInfo());
        }
        MainController.displayMainMenu();
    }

    private static void showAllRoom() {
        List<String> listLine = FileUtils.readFile(FILE_ROOM);
        for (int i = 0; i < listLine.size(); i++) {
            System.out.println(listLine.get(i));
        }
    }

    private static void showAllHouse() {
        List<String> listLine = FileUtils.readFile(FILE_HOUSE);
        for (int i = 0; i < listLine.size(); i++) {
            System.out.println(listLine.get(i));
        }
    }

    private static void showAllVilla() {
        List<String> listLine = FileUtils.readFile(FILE_VILLA);
        for (int i = 0; i < listLine.size(); i++) {
            System.out.println(listLine.get(i));
        }

    }
}
