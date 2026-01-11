package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    // Write a program to compute the percentage of board exam marks of a user.
    public static double marksPercentage(int phy, int che, int math, int urdu, int eng) {
        return (double) (phy + che + math + urdu + eng) / 5;
    }

    public static void marksPercentage(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        System.out.println(Arrays.toString(marks));
    }
    public static void main(String[] args) {

//        System.out.println("Program to take input from user, display the output and update the data.");
//        Scanner sc = new Scanner(System.in);
//
//        int[] marks = new int[3];
//
//        System.out.println("Enter your physics marks");
//        marks[0] = sc.nextInt();
//
//        System.out.println("Enter your Chemistry marks");
//        marks[1] = sc.nextInt();
//
//        System.out.println("Enter your Math marks");
//        marks[2] = sc.nextInt();
//
//        marks[0] = marks[0] + 3;
//
//        System.out.println("Your updated physics marks is: " + marks[0]);

//        System.out.println("Program to compute the percentage of board exam marks of a user.");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your physics, chemistry, math, urdu, and english marks");
//        int phy = sc.nextInt();
//        int che = sc.nextInt();
//        int math = sc.nextInt();
//        int urdu = sc.nextInt();
//        int eng = sc.nextInt();
//
//        double res = marksPercentage(phy, che, math, urdu, eng);
//        System.out.println("Your have got: " + res + "%");

        int[] marks = {86, 97, 63};
        marksPercentage(marks);
    }
}
