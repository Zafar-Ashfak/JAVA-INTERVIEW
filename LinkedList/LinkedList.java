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
  public static int size;

  // ------<<<Methods>>>--------

  // Add First Method
  public void addFirst(int data) {
    // Creating New Node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // Add Last Method
  public void addLast(int data) {
    // Creating New Node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  // Add node on the specific index
  public void add(int idx, int data) {
    // Creating New Node
    Node newNode = new Node(data);
    size++;
    int i = 0;
    Node temp = head;
    if (idx == 0) {
      addFirst(data);
      return;
    }

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  // Remove Fist Node
  public int removeFirst() {
    if (size == 0) {
      System.out.println("Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  // Remove Last Node
  public int removeLast() {
    if (size == 0) {
      System.out.println("Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }

    int val = tail.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  // Print Linked List
  public void printLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }

    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(11);
    ll.addFirst(12);
    ll.addLast(13);
    ll.addLast(14);
    ll.add(2, 99);

    System.out.println("Size: " + size);
    ll.printLL();

    System.out.println(ll.removeLast());
    System.out.println("Size: " + size);
    ll.printLL();

    System.out.println(ll.removeLast());
    System.out.println("Size: " + size);
    ll.printLL();

    System.out.println(ll.removeLast());
    System.out.println("Size: " + size);
    ll.printLL();

    System.out.println(ll.removeLast());
    System.out.println("Size: " + size);
    ll.printLL();

    System.out.println(ll.removeLast());
    System.out.println("Size: " + size);
    ll.printLL();
  }
}