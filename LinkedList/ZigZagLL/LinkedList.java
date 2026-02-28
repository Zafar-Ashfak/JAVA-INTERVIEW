public class LinkedList {
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

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void printLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public Node getMidNode() {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public void zigZagLL() {
    // Step 1: Find mid node
    Node midNode = getMidNode();

    // Step 2: Reverse 2nd Half
    Node prev = null;
    Node curr = midNode.next;
    Node next;
    midNode.next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    // Step 3: Merge nodes in Zig-Zag fashion
    Node lh = head;
    Node rh = prev;
    Node nextL, nextR;

    while (lh != null && rh != null) {
      nextL = lh.next;
      lh.next = rh;
      nextR = rh.next;
      rh.next = nextL;

      lh = nextL;
      rh = nextR;
    }

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.add(7);
    ll.add(8);

    ll.printLL();
    ll.zigZagLL();
    ll.printLL();
  }
}