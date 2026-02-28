public class LinkedList {
  public static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedLL = new ListNode(-1);
    ListNode temp = mergedLL;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }

    while (list1 != null) {
      temp.next = list1;
      list1 = list1.next;
      temp = temp.next;
    }

    while (list2 != null) {
      temp.next = list2;
      list2 = list2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(4);

    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(3);
    list1.next.next = new ListNode(4);

    
  }
}
