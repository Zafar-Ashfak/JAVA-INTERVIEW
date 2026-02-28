public class DiamondPattern {
  public static void main(String[] args) {
    int k = 0;
    for (int i = 1; i <= 5; i++) {
      int num = i <= 3 ? k++ : k--;
      for (int j = 1; j <= 5; j++) {
        if (j >= 4 - k && j <= 2 + k) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
