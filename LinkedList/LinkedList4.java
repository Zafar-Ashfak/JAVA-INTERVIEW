// program to check if a linked list is palindrome or not
public class LinkedList4 {
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

  // ----<Methods>----
  public void addLast(int data) {
    // Creating new Node
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public Node getMidNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public boolean isPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    Node midNode = getMidNode(head);

    // Reverse Half LinkedList
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node left = head;
    Node right = prev;

    // Check if left part and right part are equal
    while (right != null) {
      if (left.data != right.data) {
        return false;
      }

      left = left.next;
      right = right.next;
    }

    return true;

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
    LinkedList4 ll = new LinkedList4();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);

    ll.printLL();
    System.out.println(ll.isPalindrome());

  }
}