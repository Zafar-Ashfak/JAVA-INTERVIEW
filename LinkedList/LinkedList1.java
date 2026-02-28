public class LinkedList1 {
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

  // AddLast Method
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

  // Search Iterative - O(n)
  public int searchIterative(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }

      i++;
      temp = temp.next;
    }

    return -1;
  }

  public int searchRecursive(Node head, int key, int i) { // O(n)
    // Base Case
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return i;
    }

    return searchRecursive(head.next, key, i + 1);
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);

    int key = 10;
    ll.printLL();

    // int ans = ll.searchIterative(key);
    // if (ans == -1) {
    // System.out.println("Key not found");
    // } else {
    // System.out.println("Key is at index: " + ans);
    // }

    int ans = ll.searchRecursive(head, key, 0);
    if (ans == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key is at index: " + ans);
    }
  }
}