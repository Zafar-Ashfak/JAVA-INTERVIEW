import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    System.out.println("Inverted Half-Pyramid with number Pattern!");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines you want to display: ");
    int n = sc.nextInt();
    char ch = '1';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j <= n - i + 1) {
          System.out.print(ch);
          ch++;
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
      ch = '1';
    }
  }
}
