import java.util.ArrayList;

public class PairSum1 {

  // Brute Force Approach - O(n^2)
  public static boolean pairSum(ArrayList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) + list.get(j) == target) {
          return true;
        }
      }
    }

    return false;
  }

  // Optimize Approach (Two pointer) - O(n)
  public static boolean optPairSum(ArrayList<Integer> list, int target) {
    int lp = 0;
    int rp = list.size() - 1;

    while (lp < rp) {
      // Case 1:
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }
      // Case 2:
      else if (list.get(lp) + list.get(rp) < target) {
        lp++;
      }

      // Case 3:
      rp--;
    }

    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    int target = 50;
    System.out.println(pairSum(list, target));
    System.out.println(optPairSum(list, target));
  }
}