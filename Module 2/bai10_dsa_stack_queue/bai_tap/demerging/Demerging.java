package C1020G1.dsa_stack_queue.bai_tap.demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Queue<Employee> queue = new LinkedList<Employee>();
        queue.add(new Employee("john", "male","11/01/1994"));
        queue.add(new Employee("Ann", "female","12/01/1998"));
        queue.add(new Employee("Selena", "female","12/01/1992"));
        queue.add(new Employee("Peter", "male","01/01/1993"));
        queue.add(new Employee("Mark", "male","12/01/1991"));
        Queue<Employee> male = new LinkedList<Employee>();
        Queue<Employee> female = new LinkedList<Employee>();
        for(Employee choose : queue){
            if(choose.getSex().equals("male")){
                male.add(choose);
            }else{
                female.add(choose);
            }
        }
        Queue<Employee> afterSort = new LinkedList<>();
        afterSort.addAll(female);
        afterSort.addAll(male);
//        System.out.println(afterSort);
        for(Employee queue1 : afterSort){
            System.out.println(queue1);
        }
    }
}
