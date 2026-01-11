package Abstraction;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear baloo = new Bear();
        baloo.plantEaters();
        baloo.FleshEaters();
    }
}

interface Herbivore {
    void plantEaters();
}

interface Carnivore {
    void FleshEaters();
}

class Bear implements Herbivore, Carnivore {
    public void plantEaters() {
        System.out.println("Bear eats honey.");
    }

    public void FleshEaters() {
        System.out.println("Bear eats fish.");
    }
}
