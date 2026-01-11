package Recursion;

import java.util.Scanner;

public class Basics {

    // Method to print numbers from n to 1 (Backwards)
    public static void backwards(int n) { // O(n)
        // Base Case
        if (n == 1) {
            System.out.print("1");
            return;
        }

        System.out.print(n + " ");
        backwards(n - 1);
    }

    // Method to print numbers from 1 to n (Forwards)
    public static void forwards(int n) { // O(n)
        // Base Case
        if (n == 1) {
            System.out.print("1 ");
            return;
        }

        forwards(n - 1);
        System.out.print(n + " ");
    }

    // Method to print factorial of a natural number (n)
    public static int factorial(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Method to print sum of n natural numbers
    public static int sumOfNaturalNums(int n) {
        int sum = 0;
        // Base Case
        if (n == 1) {
            return 1;
        }

        return sum = n + sumOfNaturalNums(n - 1);

    }

    // Method to calculate nth term of fibonacci series
    public static int fibonacci(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    // Method to check if an array is sorted or not
    public static boolean isSorted(int[] arr, int i) {
        // Base Case
        if (i == arr.length - 1) {
            return true;
        }

        // Ascending order check
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Descending order check
//        if (arr[i] < arr[i + 1]) {
//            return false;
//        }

        return isSorted(arr, i + 1);
    }

    // Method to find the first occurrence of a key
    public static int firstOccurrence(int[] arr, int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Work
        if (arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }

    // Method to find the last occurrence of a key
    public static int lastOccurrence(int[] arr, int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        // Work
        int isFound = lastOccurrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    // Method to calculate x to the power n
    // Brute Force Approach
    public static int pow(int x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        // Work
        return x * pow(x, n - 1);
    }

    // Optimized Approach
    public static int optPower(int x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        int power = optPower(x, n / 2);
        int powerSq = power * power;
        if (n % 2 != 0) {
            powerSq = x * powerSq;
        }

        return powerSq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print x to the power n");
        System.out.println("Enter a base number");
        int x = sc.nextInt();

        System.out.println("Enter a power");
        int n = sc.nextInt();

        System.out.println(x + " to the power " + n + " is: " + optPower(x, n));
    }
}
