package C1020G1.abstract_class.thuc_hanh.lop_animal_interface.animal;

import C1020G1.abstract_class.thuc_hanh.lop_animal_interface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
