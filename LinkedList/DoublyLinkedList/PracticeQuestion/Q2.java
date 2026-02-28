public class Q2 {
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

  public Node deleteNodes(Node head, int M, int N) {
    if (head == null) return null;
    
    Node current = head;
    Node prev = null;
    
    while (current != null) {
        // Keep M nodes
        int keepCount = M;
        while (keepCount > 0 && current != null) {
            prev = current;
            current = current.next;
            keepCount--;
        }
        
        // Delete N nodes
        int deleteCount = N;
        while (deleteCount > 0 && current != null) {
            current = current.next;
            deleteCount--;
        }
        
        // Link previous node to the current node (after deleting N nodes)
        if (prev != null) {
            prev.next = current;
        }
    } 
    return head;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    Node temp = head;
    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }

    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    Q2 dll = new Q2();
    dll.addLast(1);
    dll.addLast(2);
    dll.addLast(3);
    dll.addLast(4);
    dll.addLast(5);
    dll.addLast(6);
    dll.addLast(7);
    dll.addLast(8);

    dll.print();
    dll.deleteNodes(head, 2, 2);
    dll.print();
  }
}
