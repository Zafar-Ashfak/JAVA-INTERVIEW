import java.util.Scanner;

public class PyramidPattern {
  public static void main(String[] args) {
    System.out.println("Butterfly Pattern!");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines(even) you want to display: ");
    int n = sc.nextInt();
    int k = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n * 2 - 1); j++) {
        if (j >= n - i + 1 && j <= n + i - 1) {
          System.out.print(k);
          int ternaryOp = j < (n * 2 - 1) / 2 + 1 ? k-- : k++;
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
