// Arraylist basics
import java.util.ArrayList;

public class ArrayListBasics {
  public static int getMaximum(ArrayList<Integer> list) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
      max = Math.max(max, list.get(i));
    }

    return max;
  }

  public static void main(String[] args) {
    // Creating ArrayList by JCF
    ArrayList<Integer> list = new ArrayList<>();

    // Add Method - O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);

    System.out.println(list);
    // Size method -  O(1)
    System.out.println("Size of the list is: " + list.size()); 

    // Get Element - O(1)
    System.out.println(list.get(2));
    System.out.println(list.get(5));

    // Remove Element - O(n)
    list.remove(3);
    System.out.println(list);

    // contains method - O(n)
    System.out.println(list.contains(5));
    System.out.println(list.contains(19));
  }
}
