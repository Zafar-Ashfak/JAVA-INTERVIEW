package BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void isEven(int num) { // O(1)
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static int getIthBit(int num, int ithBit) {
        int bitMask = 1 << ithBit;
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int clearIthBit(int num, int ithBit) {
        int bitMask = ~(1 << ithBit);
        return num & bitMask;
    }

    public static int setIthBit(int num, int ithBit) {
        int bitMask = 1 << ithBit;
        return num | bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
//        if (newBit == 0) {
//            return clearIthBit(num, i);
//        } else {
//            return setIthBit(num, i);
//        }

        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }

    public static int clearLastIBits(int num, int i) {
        int bitMask = (-1 << i);
        return num & bitMask;
    }

    // Check if a number is power of 2 or not
    public static boolean isPowerOf2(int num) {
        return (num & (num - 1)) == 0;
    }

    // Program to count set bits of a number
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }

            num >>= 1;
        }

        return count;
    }

    // Program to swap two numbers
    public static void swap(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping");
        System.out.println("a = " + a + ", b = " + b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to swap two numbers");

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("a = " + a + ", b = " + b);

        swap(a, b);


    }
}
