// Doubly Linked List implementation program
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
  public static int size;

  // --------<Methods>--------
  // AddFirst Method O(1)
  public void addFirst(int data) {
    // Creating new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  // addLast Method O(1)
  public void addLast(int data) {
    // Creating new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
  }

  // Remove First Method
  public int removeFirst() {
    // Base Case
    if (size == 0) {
      System.out.println("Doubly Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }

  // Remove Last Method
  public int removeLast() {
    // Base Case
    if (size == 0) {
      System.out.println("Doubly Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return val;
  }

  public void printDLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(4);
    dll.addLast(5);
    dll.addLast(6);
    dll.printDLL();

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

    System.out.println("Removed last data: " + dll.removeLast());
    dll.printDLL();
    System.out.println("Size of dll: " + size);

  }
}