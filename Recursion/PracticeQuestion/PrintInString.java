package Recursion.PracticeQuestion;

import java.util.Scanner;

public class PrintInString {
    public static void convertIntoString(int num) {
        String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int i = 0;

        // Base Case
        if (num == 0) {
            return;
        }

        // Work
        int rem = num % 10;
        convertIntoString(num / 10);
        System.out.print(digits[rem] + " ");
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print a number into string");
        System.out.println("Enter a number");
        int num = sc.nextInt();
        convertIntoString(num);
    }
}
