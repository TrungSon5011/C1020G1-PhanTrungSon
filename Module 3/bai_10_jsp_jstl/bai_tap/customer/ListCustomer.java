package bai_tap.customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    public static List<Customer> getCustomerList(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(" Mai Suong ","1996-06-16","Hue","https://i.imgur.com/guYOOWO.jpg"));
        customerList.add(new Customer(" Thuỳ Trâm ","1996-06-16","Hue","https://i.imgur.com/OgP9oxJ.jpg"));
        customerList.add(new Customer(" Ngọc Trinh ","1996-06-16","Hue","https://i.imgur.com/fNpjsU3.jpg"));
        return customerList;
    }
}
