public class RemoveCycle {
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
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2

      if (slow == fast) {
        return true; // cycle exists
      }
    }

    return false; // cycle doesn't exist
  }

  public static void removeCycle() {
    // Detect Cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (cycle == false) {
      return;
    }

    Node lastNode = null;
    slow = head;
    while (slow != fast) {
      slow = slow.next; // +1
      lastNode = fast;
      fast = fast.next; // +1
    }

    lastNode.next = null;
  }

  public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    Node temp = new Node(3);
    head.next.next = temp;
    head.next.next.next = new Node(4);
    head.next.next.next.next = temp;

    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());
  }
}