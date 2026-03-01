package LinkedList;

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

    // METHODS

//    1. Add Node at First of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // 2. Add Node at the last of the LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail =newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    static void main() {
        LinkedList ll = new LinkedList();

        // Adding data at the first
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
    }
}
