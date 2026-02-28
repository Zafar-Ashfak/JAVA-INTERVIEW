// Program to calculate container with most water
import java.util.ArrayList;

public class ContainerWithMostWater {

  // Brute Approach - O(n^2)
  public static int storeWater(ArrayList<Integer> height) {
    int maxwater = 0;
    for (int i = 0; i < height.size(); i++) {
      for (int j = i + 1; j < height.size(); j++) {
        int width = j - i;
        int ht = Math.min(height.get(i), height.get(j));
        int currWater = width * ht;
        maxwater = Math.max(currWater, maxwater);
      }

    }

    return maxwater;
  }

  // 2 Pointer Approach (optimize) - O(n)
  public static int optStoreWater(ArrayList<Integer> height) {
    int maxwater = 0;
    int lp = 0;
    int rp = height.size() - 1;
    while (lp < rp) {

      // Calculate currWater
      int ht = Math.min(height.get(lp), height.get(rp));
      int width = rp - lp;
      int currWater = width * ht;
      maxwater = Math.max(maxwater, currWater);

      // update pointers
      if (height.get(lp) < height.get(rp)) {
        lp++;
      } else {
        rp--;
      }
    }

    return maxwater;
  }

  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    // int maxwater = storeWater(height);
    int maxwater = optStoreWater(height);
    System.out.println(maxwater);

  }
}
