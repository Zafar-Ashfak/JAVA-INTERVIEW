package LinkedList;

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
    public static int size;

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

    public Node findMidNode(Node head) {
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

        // Find the middle node
        Node mid = findMidNode(head);

        // Divide the LinkedList in two halves and reverse the 2nd half (right)
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // Check both LinkedList are palindrome
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right  = right.next;
        }

        return true;
    }

    static void main() {
        LinkedList1 ll = new LinkedList1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        boolean res = ll.isPalindrome();
        if (res) {
            System.out.println("LinkedList is palindrome");
        } else {
            System.out.println("LinkedList is not palindrome");
        }
    }
}
