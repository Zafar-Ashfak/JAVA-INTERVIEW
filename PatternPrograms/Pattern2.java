import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Star Pattern(Inverted) program to print n numbers of lines ");
    System.out.println("Enter the number");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i + 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
