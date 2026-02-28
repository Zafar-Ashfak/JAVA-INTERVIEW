// Program to count number of elements in a matrix
public class Q1 {
  public static int countNumberOfElement(int array[][], int key) {
    int count = 0;
    for  (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == key) {
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int array[][] = { { 4, 7, 8 },
        { 8, 8, 7 } };

        int key = 7;
        int count = countNumberOfElement(array, key);
        System.out.println("Number of " + key + "'s element comes " +  count + " times in the array");
  }
}
