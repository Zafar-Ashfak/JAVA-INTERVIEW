import java.util.Scanner;

public class TrianglePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("0 - 1 Triangle Pattern");
    System.out.print("Enter the number of lines you want to dispaly: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
