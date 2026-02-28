public class LinkedList3 {
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

  public void addLast(int data) {
    // Creating New Node
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

  public void delNthNodeFromEnd(int nthNode) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }

    if (size == nthNode) {
      head = head.next; // Remove First Operation
      return;
    }

    int i = 0;
    int iToNthNode = size - nthNode;
    Node prev = head;
    while (i < iToNthNode - 1) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
  }

  public static void main(String[] args) {
    LinkedList3 ll = new LinkedList3();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.printLL();
    ll.delNthNodeFromEnd(3);
    ll.printLL();
  }
}