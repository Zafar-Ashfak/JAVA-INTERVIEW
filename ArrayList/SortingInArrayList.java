import java.util.*;

public class SortingInArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(6);
    list.add(7);
    list.add(3);
    list.add(5);
    list.add(8);
    list.add(1);
    list.add(4);
    System.out.println("Original list");
    System.out.println(list);
    System.out.println("Sort un asscending order");
    Collections.sort(list);
    System.out.println(list);
    System.out.println("Sort in descending order");
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

  }
}
