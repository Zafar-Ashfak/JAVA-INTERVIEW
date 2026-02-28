// Program to sort a linked list using merge sort
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

  private Node getMidNode(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2
    }

    return slow;
  }

  public Node mergeSort(Node head) {
    // Base Case
    if (head == null || head.next == null) {
      return head;
    }
    // Recursion
    Node midNode = getMidNode(head);
    Node leftHead = head;
    Node rightHead = midNode.next;
    midNode.next = null;
    Node newLeft = mergeSort(leftHead);
    Node newRight = mergeSort(rightHead);
    return merge(newLeft, newRight);
  }

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
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
    LinkedList ll = new LinkedList();
    ll.add(5);
    ll.add(9);
    ll.add(11);
    ll.add(3);
    ll.add(8);

    ll.printLL();
    ll.head = ll.mergeSort(ll.head);
    ll.printLL();
  }
}