package OOPs;

public class OOP {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Md Anwar Alam";
        s1.roll = 123;
        s1.password = "abed";
        s1.marks[0] = 83;
        s1.marks[1] = 96;
        s1.marks[2] = 91;

        Student s2 = new Student(s1); // Copying properties in s2 from s1
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Pen {
    String color;
    int tip;

    public void changeColor(String clr) {
        color = clr;
    }

    public void changeTip(int tp) {
        tip = tp;
    }
}

class Account {
    public String username;
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Student {
    public String name;
    public int roll;
    String password;
    int[] marks;

    public Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    public Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    public Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    public Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    // Shallow Copy Constructor
//    public Student(Student s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }
















    // Deep Copy Constructor
    public Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

//        Deep Copying
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s1.marks[i];
        }
    }

}

