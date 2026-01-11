package Searching;

public class Searching {

    // Write a java method to search a key in an array using linear search
    public static int linearSearch(int[] nums, int key) { // O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // Write a java method to find the largest element in the array
    public static int getLargest(int[] nums) { // O(n)
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    // Write a java method to find the largest element in the array
    public static int getSmallest(int[] nums) { // O(n)
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    // Write a java method to search a key in an array using binary search
    public static int binarySearch(int[] nums, int key) { // O(log n)
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;

            // if key is at middle element
            if (key == nums[mid]) {
                return mid;
                // if key is smaller than middle element
            } else if (key <= nums[mid]) {
                ei = mid - 1;
                // if key is larger than middle element
            } else {
                si = mid + 1;
            }
        }

        return -1;
    }

    // Write a java method to reverse a given array
    public static void reverseArray(int[] nums) { // O(n)
        int si = 0;
        int ei = nums.length - 1;
        int mid = (si + ei) / 2;

        while (si <= mid && ei >= mid) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;

            si++;
            ei--;
        }
    }

    // Write a java method to print pair of numbers with a given array
    public static void printPairs(int[] nums) { // O(n ^ 2)
        int totalPair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ")  ");
                totalPair++;
            }
            System.out.println();
        }

        System.out.println("The total pair of elements is: " + totalPair);
    }

    // Write a java method to print subarrays of a given array

    public static void printSubarrays(int[] nums) { // O(n ^ 3)
        int totalSubarrays = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    totalSubarrays++;
                }
                System.out.println();
            }

        }

        System.out.println("Total subarrays in the array is: " + totalSubarrays);
    }


    // Brute Force Approach
    public static int maxSubarraySum(int[] nums) { // O(n ^ 3)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;

    }

    // Prefix Algorithm Optimized than Brute Force
    public static int prefixSum(int[] nums) { // O(n ^ 2)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Prefix sum
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        // Calculating maximum subarray sum
        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    // Kadane's Algorithms
    public static int kadaneAlgorithm(int[] nums) { // O(n)
        int ms = 0;
        int cs = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cs < 0) {
                cs = 0;
            }

            cs += nums[i];
            ms = Math.max(ms, cs);
        }

        return ms;
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int maxSum = maxSubarraySum(nums);
//        int maxSum = prefixSum(nums);
        int maxSum = kadaneAlgorithm(nums);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
