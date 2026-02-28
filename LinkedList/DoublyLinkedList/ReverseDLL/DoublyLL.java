// Program to reverse a Doubly Linked List
public class DoublyLL {
  public static class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
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
    newNode.prev = tail;
    tail = newNode;
  }

  public void printDLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverseDLL() {
    Node prev = null;
    Node curr = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }

    head = prev;
  }

  public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.add(1);
    dll.add(2);
    dll.add(3);
    dll.add(4);
    dll.printDLL();
    dll.reverseDLL();
    dll.printDLL();
  }
}
