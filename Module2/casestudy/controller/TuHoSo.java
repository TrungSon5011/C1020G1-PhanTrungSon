package controller;

import commons.FileUtils;
import models.Employee;

import java.util.List;
import java.util.Stack;

public class TuHoSo {
    public static final String FILE_EMPLOYEE = "src/data/Employee.csv";
    public static void searchEmployee(String id){
        List<String> employeeList = FileUtils.readFile(FILE_EMPLOYEE);
        List<Employee> employeeStack = new Stack<>();
        for (int i = 0; i < employeeList.size(); i++) {
            String [] temp = employeeList.get(i).split(",");
            String idEmployee = temp[0];
            String nameEmployee = temp[1];
            String addressEmployee = temp[2];
            employeeStack.add(new Employee(idEmployee,nameEmployee,addressEmployee));
        }
        for (int i = 0; i < employeeStack.size(); i++) {
            if(id.equals(employeeStack.get(i).getIdEmployee())){
                System.out.println(employeeStack.get(i).toString());
            }
        }
    }
    public static void main(String[] args) {
        searchEmployee("2");

    }

}
