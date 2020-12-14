package C1020G1.dsa_stack_queue.bai_tap.demerging;

import java.util.Comparator;

public class ComparotorByDay implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.birthday.compareTo(o1.birthday);
    }
}
