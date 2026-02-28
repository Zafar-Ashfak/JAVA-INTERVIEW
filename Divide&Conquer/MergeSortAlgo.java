public class MergeSortAlgo {
  public static void mergeSort(int arr[], int si, int ei) {
    // Base Case
    if (si >= ei) {
      return;
    }
    // Kaam
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    // while (i <= mid && j <= ei) {
    // temp[k++] = Math.min(arr[i++], arr[j++]);
    // }

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // Copy elements from temp array to original array
    for (int l = 0, m = si; l < temp.length; l++, m++) {
      arr[m] = temp[l];
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 8 };
    mergeSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}