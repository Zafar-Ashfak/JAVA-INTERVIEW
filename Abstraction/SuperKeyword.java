package Abstraction;

public class SuperKeyword {
    public static void main(String[] args) {
        Ant ant = new Ant();
        System.out.println("Ants are " + ant.color + " in color.");
    }
}

class Insect {
    String color;

    public Insect() {
        System.out.println("Insect constructor is called...");
    }
}

class Ant extends Insect {
    public Ant() {
//        super();
        super.color = "black or red";

        System.out.println("Ant constructor is called...");
    }
}
