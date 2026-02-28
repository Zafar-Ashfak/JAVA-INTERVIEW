// Intersection of Two Linked lists. In a system there are two singly linked list.
// By some programming error, the end node of one of the linked lists got linked to
// the second list. forming an iverted Y - shaped list. Write a program to get the 
// point where two linked lists merge.

// We have to find the intersection part in this system.
public class Q1 {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node findIntersection(Node head1, Node head2) {
    while (head2 != null) {
      Node temp = head1;
      while (temp != null) {
        if (temp == head2) {
          return head2;
        }

        temp = temp.next;
      }
      head2 = head2.next;
    }

    return null;
  }

  public static void main(String[] args) {
    Node head1 = new Node(1);
    head1.next = new Node(2);
    head1.next.next = new Node(3);
    Node temp = new Node(6);
    head1.next.next.next = temp;
    head1.next.next.next.next = new Node(7);

    Node head2 = new Node(4);
    head2.next = new Node(5);
    head2.next.next = temp;

    System.out.println(findIntersection(head1, head2).data);
  }
}