

package LinkedList;

public class CharLinkedList {

    // Node class
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public CharLinkedList() {
        head = null;
        size = 0;
    }

    // Insert at beginning
    public void insertAtBeginning(char data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert at end
    public void insertAtEnd(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    // Insert at specific position (1-based)
    public void insertAtPosition(char data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Delete by value (first occurrence)
    public void deleteByValue(char data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            System.out.println("'" + data + "' deleted successfully.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data)
            temp = temp.next;
        if (temp.next == null) {
            System.out.println("'" + data + "' not found in the list!");
            return;
        }
        temp.next = temp.next.next;
        size--;
        System.out.println("'" + data + "' deleted successfully.");
    }

    // Delete by position (1-based)
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            System.out.println("'" + head.data + "' deleted successfully.");
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++)
            temp = temp.next;
        System.out.println("'" + temp.next.data + "' deleted successfully.");
        temp.next = temp.next.next;
        size--;
    }

    // Search for a character — returns position or -1
    public int search(char data) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == data)
                return position;
            temp = temp.next;
            position++;
        }
        return -1;
    }

    // Get character at position (1-based)
    public char getAt(int position) {
        if (position < 1 || position > size)
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        Node temp = head;
        for (int i = 1; i < position; i++)
            temp = temp.next;
        return temp.data;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Convert list to String
    public String listToString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        return sb.toString();
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Clear the list
    public void clear() {
        head = null;
        size = 0;
        System.out.println("List cleared.");
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print("'" + temp.data + "'");
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }

    // ─── Main / Demo ────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        CharLinkedList list = new CharLinkedList();

        System.out.println("=== Char Linked List in Java ===\n");

        // Insert at end
        System.out.println("-- Inserting at end: J, a, v, a --");
        list.insertAtEnd('J');
        list.insertAtEnd('a');
        list.insertAtEnd('v');
        list.insertAtEnd('a');
        list.display();

        // Insert at beginning
        System.out.println("\n-- Inserting 'X' at beginning --");
        list.insertAtBeginning('X');
        list.display();

        // Insert at position
        System.out.println("\n-- Inserting '!' at position 4 --");
        list.insertAtPosition('!', 4);
        list.display();

        // Size
        System.out.println("\n-- Size: " + list.getSize() + " --");

        // Search
        System.out.println("\n-- Searching for 'v' --");
        int pos = list.search('v');
        System.out.println(pos != -1 ? "'v' found at position " + pos : "'v' not found");

        // Get at position
        System.out.println("\n-- Character at position 2: '" + list.getAt(2) + "' --");

        // Delete by value
        System.out.println("\n-- Deleting '!' by value --");
        list.deleteByValue('!');
        list.display();

        // Delete at position
        System.out.println("\n-- Deleting node at position 1 --");
        list.deleteAtPosition(1);
        list.display();

        // Convert to String
        System.out.println("\n-- List as String: \"" + list.listToString() + "\" --");

        // Reverse
        System.out.println("\n-- Reversing the list --");
        list.reverse();
        list.display();

        // Clear
        System.out.println("\n-- Clearing the list --");
        list.clear();
        list.display();
    }
}