import java.util.ArrayList;

public class PairSum2 {
  // Optimize Approach (Two pointer) - O(n)
  public static boolean pairSum(ArrayList<Integer> list, int target) {
    int bp = -1;
    // Finding breaking point
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) > list.get(i + 1)) {
        bp = i;
        break;
      }
    }

    int lp = bp + 1;
    int rp = bp;

    // checking pair sum is equal to target
    int n = list.size();
    while (lp != rp) {
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      } else if (list.get(lp) + list.get(rp) < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (n + rp - 1) % n;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);

    int target = 16;
    System.out.println(pairSum(list, target));
  }
}