package Grid;

public class DiagonalSum {

    // Brute Force Approach
    public static int getDiagonalSum(int[][] matrix) { // O(n ^ 2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    // Optimized Approach
    public static int getDiagonalSumOpt(int[][] matrix) { // O(n)
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];

            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

//        int sum = getDiagonalSum(matrix);
        int sum = getDiagonalSumOpt(matrix);
        System.out.println("The sum of diagonal matrix is: " + sum);
    }
}
