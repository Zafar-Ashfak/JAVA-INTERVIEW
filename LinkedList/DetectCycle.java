public class DetectCycle {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public static boolean isCycle() {
    Node slow = head; // +1
    Node fast = head; // +2

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true; // cycle exists
      }
    }

    return false; // cycle doesn't exist
  }

  public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head;

    System.out.println(isCycle());

  }
}