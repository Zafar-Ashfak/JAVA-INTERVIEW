package OOPs;

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("***************** TUNA *****************");
        Tuna tuna = new Tuna();
        tuna.smellAbility();
        tuna.setFins(3);
        System.out.println("Tuna have " + tuna.getFins() + " fins.");
        tuna.swim();
        tuna.setSkinColor("blue");
        System.out.println("Tuna fishes are mostly " + tuna.getSkinColor() + " in color.");
        tuna.eat();
        tuna.breath();

        System.out.println("***************** SHARK *****************");
        Shark shark = new Shark();
        shark.huntAbility();
        shark.setFins(7);
        System.out.println("Shark have " + shark.getFins() + " fins.");
        shark.swim();
        shark.setSkinColor("gray");
        System.out.println("Shark fishes are mostly " + shark.getSkinColor() + " in color.");
        shark.eat();
        shark.breath();

        System.out.println("***************** PEACOCK *****************");
        Peacock peacock = new Peacock();
        peacock.beauty();
        peacock.setWings(2);
        System.out.println("Peacock have " + peacock.getWings() + " wings.");
        peacock.fly();
        peacock.setSkinColor("colorful");
        System.out.println("Peacocks are " + peacock.getSkinColor() + " in color.");
        peacock.eat();
        peacock.breath();

        System.out.println("***************** DOG *****************");
        Dog dobby = new Dog();
        dobby.bark();
        dobby.setLeg(4);
        System.out.println("Dogs have " + dobby.getLeg() + " legs.");
        dobby.walk();
        dobby.setSkinColor("white, black, brown, patchy");
        System.out.println("Dogs are " + dobby.getSkinColor() + " in color.");
        dobby.eat();
        dobby.breath();

        System.out.println("***************** CAT *****************");
        Cat cat = new Cat();
        cat.meow();
        cat.setLeg(4);
        System.out.println("Cats have " + cat.getLeg() + " legs.");
        cat.walk();
        cat.setSkinColor("white, black, brown, patchy");
        System.out.println("Cats are " + cat.getSkinColor() + " in color.");
        cat.eat();
        cat.breath();


        System.out.println("***************** HUMAN *****************");
        Human human = new Human();
        human.run();
        human.setLeg(2);
        System.out.println("Humans have " + human.getLeg() + " legs.");
        human.walk();
        human.setSkinColor("white / black");
        System.out.println("Humans are " + human.getSkinColor() + " in color.");
        human.eat();
        human.breath();


    }
}

// Base Class / Parent Class
class Animal {
    private String skinColor;

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void breath() {
        System.out.println("Breathing...");
    }
}

class Fish extends Animal {
    private int fins;

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}

class Tuna extends Fish {
    public void smellAbility() {
        System.out.println("Tuna have weaker smell ability.");
    }
}

class Shark extends Fish {
    public void huntAbility() {
        System.out.println("Sharks can hunt large animals like seals, turtles, and big fish.");
    }
}

// Derived Class / Child Class
class Bird extends Animal {
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void fly() {
        System.out.println("Flying...");
    }
}

class Peacock extends Bird {
    public void beauty() {
        System.out.println("Peacock is one of the most beautiful bird.");
    }
}


class Mammal extends Animal {
    private int leg;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog always barking on the stranger...");
    }
}

class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats voice are Meow, purr, hiss, growl");
    }
}

class Human extends Mammal {
    public void run() {
        System.out.println("Human runs on two legs...");
    }
}