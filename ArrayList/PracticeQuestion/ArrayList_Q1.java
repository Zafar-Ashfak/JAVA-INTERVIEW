// Program to check if an ArrayList monotonic
import java.util.ArrayList;

public class ArrayList_Q1 {
  public static boolean isMonotonic(ArrayList<Integer> list) {
    boolean inc = true;
    boolean dec = true;

    for (int i = 0; i < list.size() - 1; i++) {
      // Monotonic Incresing
      if (list.get(i) > list.get(i + 1)) {
        inc = false;
      }

      // Monotonic Decresing
      if (list.get(i) < list.get(i + 1)) {
        dec = false; 
      }
    }

    return inc || dec;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(3);
    list1.add(4);
    list1.add(5);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(5);
    list2.add(5);
    list2.add(10);
    list2.add(4);
    list2.add(3);
    list2.add(2);
    list2.add(1);

    System.out.println(isMonotonic(list1));
    System.out.println(isMonotonic(list2));
  }
}
