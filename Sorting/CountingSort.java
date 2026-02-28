package Sorting;

public  class CountingSort {
    public static void countingSort(int[] arr) { // O(n ^ 2)
        int largest = Integer.MIN_VALUE;

        // Finding out the largest element
        for (int curr : arr) {
            largest = Math.max(largest, curr);
        }

        // Calculating frequency of the elements in the array
        int[] freq = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 3, 2 };
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };

        countingSort(arr);
        printArr(arr);
    }
}