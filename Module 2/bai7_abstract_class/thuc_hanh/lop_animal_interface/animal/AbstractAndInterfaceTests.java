package C1020G1.abstract_class.thuc_hanh.lop_animal_interface.animal;

import C1020G1.abstract_class.thuc_hanh.lop_animal_interface.Edible;
import C1020G1.abstract_class.thuc_hanh.lop_animal_interface.fruit.Apple;
import C1020G1.abstract_class.thuc_hanh.lop_animal_interface.fruit.Fruit;
import C1020G1.abstract_class.thuc_hanh.lop_animal_interface.fruit.Orange;

public class AbstractAndInterfaceTests {
    private static Object animal;

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        if(animal instanceof Chicken){
            Edible edibler = (Chicken) animal;
            System.out.println(edibler.howToEat());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
