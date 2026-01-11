package Recursion.PracticeQuestion;

public class FindAllOccurrences {
    public static void getAllOccurrences(int[] arr, int key, int i) { // O(n)
        // Base Case
        if (i == arr.length) {
            return;
        }

        // Work
        if (arr[i] == key) {
            System.out.print(STR."\{i} ");
        }

        getAllOccurrences(arr, key, i + 1);
    }

    void main() {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        getAllOccurrences(arr, key, 0);
    }
}
