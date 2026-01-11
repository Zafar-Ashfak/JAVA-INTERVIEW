package Grid;

import java.util.Scanner;

public class Search {
    public static void searchInMatrix(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at cell: " + "[" + i + ", " + j + "]");
                }
            }
        }
    }

    // Write a java method to find the largest element in an array of user's input
    public static int getLargest(int[][] matrix) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers");

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int largest = getLargest(matrix);
        System.out.println("The largest element is: " + largest);

    }
}
