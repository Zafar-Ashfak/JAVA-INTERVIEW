public class LinkedList2 {
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

  // ---------<Methods>--------
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

  public void reverseLL() {
    Node prev = null;
    Node curr = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void printLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }

    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList2 ll = new LinkedList2();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.printLL();
    ll.reverseLL();
    ll.printLL();
  }
}