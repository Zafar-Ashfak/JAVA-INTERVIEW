package Recursion;

import java.util.Scanner;

public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Work
        printBinStrings(n - 1, 0,str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }

    }
    void main() {
        System.out.println("Program to print binary strings of size n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        printBinStrings(n, 0, " ");
    }
}
