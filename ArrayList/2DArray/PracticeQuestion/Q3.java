// Program to transpose a matrix
public class Q3 {
  public static void transposeMatrix(int matrix[][]) {
    int row = matrix.length;
    int col = matrix[0].length;

    // Print Original Matrix
    System.out.println("Original Matrix");
    printMatrix(matrix);

    // Transpose the matrix
    int transpose[][] = new int[col][row];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    // Print Transposed Matrix
    System.out.println("Transposed Matrix");
    printMatrix(transpose);

  }

  public static void printMatrix(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int matrix[][] = { { 11, 12, 13 },
        { 21, 22, 23 } };

    transposeMatrix(matrix);
  }
}
