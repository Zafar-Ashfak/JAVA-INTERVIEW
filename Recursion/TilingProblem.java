package Recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int tilingProblem(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        int ver = tilingProblem(n - 1);
        int hor = tilingProblem(n - 2);
        return ver + hor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to stick tiles on the floor 2 x n");
        System.out.println("Enter the length of the floor (n)");
        int n = sc.nextInt();

        int ways = tilingProblem(n);
        System.out.println(STR."There are \{ways} ways to stick tiles on the floor 2 x \{n}");
    }
}
