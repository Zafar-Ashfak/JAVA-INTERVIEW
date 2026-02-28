// Search a key in the matrix
import java.util.Scanner;

public class TwoDArrayBasics {
  public static boolean searchElement(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Key is at index" + "(" + i + ", " + j + ")");
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers from (1 to 9)");
    int n = matrix.length;
    int m = matrix[0].length;

    // Input
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the key you want to search in the matrix");
    int key = sc.nextInt();

    // Output
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(searchElement(matrix, key));
  }
}
