// Program to reverse a doubly linked list
public class DoublyLL1 {
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

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
  }

  // public void reverse() {
  // Node temp = tail;
  // while (temp != null) {
  // System.out.print(temp.data + " -> ");
  // temp = temp.prev;
  // }

  // System.out.println("null");
  // }

  public void reverse() {
    Node curr = head;
    Node prev = null;
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

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    DoublyLL1 dll = new DoublyLL1();
    dll.addLast(1);
    dll.addLast(2);
    dll.addLast(3);
    dll.addLast(4);
    dll.addLast(5);

    dll.print();
    dll.reverse();
    dll.print();
  }
}
