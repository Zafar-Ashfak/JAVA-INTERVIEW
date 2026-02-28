import java.util.Scanner;

public class FloydTriangle {
  public static void main(String[] args) {
    System.out.println("Floyd Triangle Pattern with number!");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines you want to display: ");
    int n = sc.nextInt();
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }
}
