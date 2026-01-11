package Grid.PracticeQuestion;

public class PrintSumIn2Row { // O(n)
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[1][j];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = getSum(arr);
        System.out.println("Sum of 2nd row is: " + sum);
    }
}
