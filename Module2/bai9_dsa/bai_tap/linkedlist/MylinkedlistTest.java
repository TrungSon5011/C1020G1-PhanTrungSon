package C1020G1.dsa.bai_tap.linkedlist;

public class MylinkedlistTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(45);
        myLinkedList.addLast(42);
        myLinkedList.addLast(43);
        myLinkedList.add(2,34);
        myLinkedList.add(3,11);
        myLinkedList.remove(4);
        MyLinkedList listClone = myLinkedList.clone();
        listClone.display();
//        myLinkedList.display();
//        myLinkedList.clear();
//        myLinkedList.display();
//        myLinkedList.addFirst(12);
//        System.out.println(myLinkedList.size());
//        myLinkedList.remove(1);

        myLinkedList.display();
//        System.out.println(myLinkedList.getFirst());
    }
}
