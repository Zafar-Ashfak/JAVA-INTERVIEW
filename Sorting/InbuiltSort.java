package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArr(Integer[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr = { 5, 4, 1, 3, 2 };
//        Arrays.sort(arr); // Sorting in ascending order
        Arrays.sort(arr, Collections.reverseOrder()); // Sorting in descending order
        printArr(arr);
    }
}
