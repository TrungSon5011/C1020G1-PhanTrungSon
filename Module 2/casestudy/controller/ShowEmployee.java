package controller;

import commons.FileUtils;
import models.Employee;

import java.util.*;

public class ShowEmployee {
    public static final String FILE_EMPLOYEE = "src/data/Employee.csv";
    public static void showEmployee(){
        List<String> employeeList = FileUtils.readFile(FILE_EMPLOYEE);
        Map<String, String> employeeMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            String [] temp = employeeList.get(i).split(",");
            String id = temp[0];
            employeeMap.put(id,employeeList.get(i));
        }
        Set<String> keySet = employeeMap.keySet();
        for (String key : keySet){
            System.out.println(employeeMap.get(key));
        }
    }
}
