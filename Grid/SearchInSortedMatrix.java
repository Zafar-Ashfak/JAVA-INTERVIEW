package Grid;

public class SearchInSortedMatrix {
    public static void search(int[][] matrix, int key) { // O(n ^ 2)
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Key is at index" + "(" + row + ", " + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        int key = 13;

            search(matrix, key);
    }
}
