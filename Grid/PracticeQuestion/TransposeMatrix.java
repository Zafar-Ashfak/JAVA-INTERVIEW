package Grid.PracticeQuestion;

public class TransposeMatrix {
    public static void transposedMatrix(String[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        String[][] transpose = new String[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        String[][] matrix = {{"a11", "a12", "a13"}, {"a21", "a22", "a23"}};
        System.out.println("Original Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix");
        transposedMatrix(matrix);
    }
}
