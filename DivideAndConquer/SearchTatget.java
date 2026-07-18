public class SearchTatget {
  public static int search(int arr[], int tar, int si, int ei) {
    // Base Case
    if (si > ei) {
      return -1;
    }

    // Kaam
    int mid = si + (ei - si) / 2;

    // target found
    if (arr[mid] == tar) {
      return mid;
    }
    // mid on L1
    if (arr[si] <= arr[mid]) {
      // Case a:
      if (arr[si] <= tar && tar <= arr[mid]) {
        return search(arr, tar, si, mid - 1);
      }
      // Case b:
      else {
        return search(arr, tar, mid + 1, ei);
      }
    }

    // mid on L2
    else {
      // Case c:
      if (arr[mid] <= tar && tar <= arr[ei]) {
        return search(arr, tar, mid + 1, ei);
      }
      // Case d:
      else {
        return search(arr, tar, si, mid - 1);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int tar = 0;
    int index = search(arr, tar, 0, arr.length - 1);
    System.out.println("Target is at index: " + index);
  }
}