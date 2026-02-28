import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    System.out.println("Program to display Inverted & Rotated Half Pyramid Pattern");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines you want to display");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= n - i + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
