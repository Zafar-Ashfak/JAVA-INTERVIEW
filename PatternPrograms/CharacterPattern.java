import java.util.Scanner;

public class CharacterPattern {
  public static void main(String[] args) {
    char ch = 'A';
    Scanner sc = new Scanner(System.in);
    System.out.println("Star Pattern(Inverted) program to print n numbers of lines ");
    System.out.print("Enter the number of lines you wnat to display: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
