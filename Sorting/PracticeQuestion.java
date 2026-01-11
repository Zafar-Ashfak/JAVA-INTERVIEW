// Write all sorting methods to sort array in decreasing order
package Sorting;

public class PracticeQuestion {

    public static void printArr(int[] nums) {
        for (int e : nums) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 4, 2, 5};
        System.out.println("Original Array");
        printArr(nums);
        System.out.println("\nSorted Array");
//        bubbleSort(nums);
        printArr(nums);
    }
}
