package OOPs;

public class MethodOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
    }
}

class Person {
    public void work() {
        System.out.println("Work anywhere");
    }
}

class Employee extends Person {
    public void work() {
        System.out.println("Works in an office");
    }
}
