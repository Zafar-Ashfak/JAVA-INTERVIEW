import java.util.Scanner;

public class ButterflyPattern {
  public static void main(String[] args) {
    System.out.println("Butterfly Pattern!");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines(even) you want to display: ");
    int n = sc.nextInt();

    int k = 0;
    for (int i = 1; i <= n; i++) {
      if (i <= n /2) {
        k++;
      } if(i > n / 2 + 1) {
        k--;
      }
      for (int j = 1; j <= n; j++) {
        if (j <= k || j >= n - k + 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}