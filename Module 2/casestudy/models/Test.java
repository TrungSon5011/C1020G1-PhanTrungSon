package models;

public class Test {
    public static void main(String[] args) {
        Villa villa = new Villa("12","Villa",35.3,4000,1,"hour","normal","no",50.5,3);
        System.out.println(villa.showInfo());
    }
}
