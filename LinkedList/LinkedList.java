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
    public static int size = 0;

    // ************* METHODS **************

    //    1. Add Node at First of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

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
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // 3. Add in the middle
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //  Remove first Node of the LinkedList
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    //  Remove last Node of the LinkedList
    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node prev = head;
            int i = 0;
            while (i < size - 2) {
                prev = prev.next;
                i++;
            }
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;

        }
    }

    //  Search a key in the LinkedList (Iterative)
    public int searchIterative(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    //  Search a key in the LinkedList (Recursive)
//    public int searchRecursive(int key) {
//        return helper(head, key);
//    }

    //  Reverse a LinkedList
    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //  Find And Remove nth Node From End
    //  Check If a LinkedList is Palindrome

    // Print the LinkedList
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(STR."\{temp.data} -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main() {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original LinkedList");
        ll.printLinkedList();

        System.out.println("Reversed LinkedList");
        ll.reverseLinkedList();
        ll.printLinkedList();

    }
}
