package controller;

import commons.FileUtils;

import java.util.*;

public class Cinema4D {
    private final static String FILEPATH_CUSTOMER = "src/data/Customer.csv";
    public static void displayListCustomer4D(){
        List<String> listCustomer = FileUtils.readFile(FILEPATH_CUSTOMER);
        Queue<String> customerQueue = new LinkedList<>();
        for (int i = 0; i < listCustomer.size(); i++) {
            customerQueue.add(listCustomer.get(i));
        }
        for (String list : customerQueue){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        displayListCustomer4D();
    }
}
