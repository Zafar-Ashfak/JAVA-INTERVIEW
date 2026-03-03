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
    public  int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
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
    //  Search a key in the LinkedList (Iterative)
    //  Search a key in the LinkedList (Recursive)
    //  Reverse a LinkedList
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

        // Adding data at the first
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // Adding data at the last
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);

        ll.add(3, 99);

        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");

        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();
        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();

        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();

        System.out.println("***************************************");
        System.out.println(STR."Removed Value: \{ll.removeFirst()}");
        ll.printLinkedList();
        System.out.println(STR."Size of the LinkedList is: \{size}");
        System.out.println();

    }
}
