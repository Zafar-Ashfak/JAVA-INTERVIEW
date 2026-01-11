package OOPs;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(10, 20));
        System.out.println(cal.sum(10.2f, 20.5f));
        System.out.println(cal.sum(10, 20, 30));
    }
}

class Calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public float sum(float num1, float num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
