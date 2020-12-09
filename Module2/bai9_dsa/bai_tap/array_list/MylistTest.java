package C1020G1.dsa.bai_tap.array_list;

public class MylistTest {
    public static void main(String[] args) {
        MyList myList = new MyList(5);
        myList.add(0,12);
        myList.add(1,12);
        myList.add(2,11);
        myList.add(3,123);
        myList.add(3,122);
        myList.add(111);
        myList.add(111);
        MyList myList1 =  new MyList();
        myList1.add(111);
        myList1.add(111);
//        myList.clear();
        System.out.println(myList.indexOf(122));
        myList.remove(3);
        System.out.println(myList.get(2));
        System.out.println(myList.contains(12));
        myList.display();
        myList1.display();
        System.out.println(myList1.size());

    }
}
