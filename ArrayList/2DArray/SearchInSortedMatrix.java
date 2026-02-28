// Program to search an element in a sorted matrix
public class SearchInSortedMatrix {
  public static boolean stairsCaseSearch(int matrix[][], int key) {
    int row = 0, col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("Key is at index " + "(" + row + "," + col + ")");
        return true;
      } else if (matrix[row][col] > key) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("key not found!");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 10, 20, 30, 40 },
                       { 15, 25, 35, 45 },
                       { 27, 29, 37, 47 },
                       { 32, 33, 39, 50 } };

    int key = 33;
    System.out.println(stairsCaseSearch(matrix, key));
  }
}
