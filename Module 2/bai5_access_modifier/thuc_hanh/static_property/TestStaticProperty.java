package C1020G1.access_modifier.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        Car.numberOfCars = 10;
        System.out.println(Car.numberOfCars);
    }
}
