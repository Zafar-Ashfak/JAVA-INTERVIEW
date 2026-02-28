package LinkedList;

import java.util.LinkedList;

public class LLinJCF {
  public void printLL() {

  }

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    // Add First Method
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);

    // Add Last Method
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);

    ll.add(7);
    ll.add(8);
    ll.add(9);

    System.out.println(ll);

    ll.removeFirst();
    System.out.println(ll);

    ll.removeLast();
    System.out.println(ll);

    ll.remove(3);
    System.out.println(ll);
  }
}