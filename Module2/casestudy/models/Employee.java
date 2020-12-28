package models;

import commons.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String idEmployee ;
    private String nameEmployee;
    private String addressEmployee;
    private final static String COMMON = ",";
    public static final String FILE_EMPLOYEE = "src/data/Employee.csv";

    public Employee(String idEmployee, String nameEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.addressEmployee = addressEmployee;
    }

    public Employee() {
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", addressEmployee='" + addressEmployee + '\'' +
                '}';
    }
    public static void addEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1","john","New York"));
        employees.add(new Employee("2","Henry","Texas"));
        employees.add(new Employee("3","Leo","New York"));
        employees.add(new Employee("4","Bruno","Texas"));
        employees.add(new Employee("5","Selena","Lose"));
        employees.add(new Employee("6","Jack","Carribean"));
        employees.add(new Employee("7","Sepp","Washington"));
        employees.add(new Employee("8","Ann","New York"));
        employees.add(new Employee("9","Sonny","Seatle"));
        employees.add(new Employee("10","Mike","Long Beach"));
        for (int i = 0; i < employees.size(); i++) {
            String line = employees.get(i).getIdEmployee() +COMMON +employees.get(i).getNameEmployee()+COMMON+employees.get(i).getAddressEmployee();
            FileUtils.writeFile(FILE_EMPLOYEE,line);
        }
    }

//    public static void main(String[] args) {
//        addEmployee();
//    }
}
