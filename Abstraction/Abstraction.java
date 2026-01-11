package Abstraction;

public class Abstraction {
    public static void main(String[] args) {
//        Dog dobby = new Dog();
//        dobby.eat();
//        dobby.walk();
//        System.out.println("Some dogs are " + dobby.color + " in color");

//        Chicken chichi = new Chicken();
//        chichi.eat();
//        chichi.walk();

          Bulldog bd = new Bulldog();
    }
}

abstract class Animal {
    String color;

    public Animal() {
        color = "Brown";
        System.out.println("Animal constructor is called...");
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    abstract void walk();
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog constructor is called...");
    }
    void changeColor() {
        color = "Black";
    }

    public void eat() {
        System.out.println("Eating bones and meat");
    }

    void walk() {
        System.out.println("Walk on 4 legs.");
    }
}

class Bulldog extends Dog {
    public  Bulldog() {
        System.out.println("Bulldog constructor is called...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    public void eat() {
        System.out.println("Eating dana...");
    }

    void walk() {
        System.out.println("Walk on 2 legs.");
    }
}

