package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Finding out the correct position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = curr;
        }

    }

    public static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
