public class Node {
  int value;
  Node next;

  public Node(int v, Node n) {
    value = v;
    next = n;
  }

  public static int countPositive(Node head) {
    if (head == null) {
      return 0;
    } else if (head.value > 0) {
      return 1 + countPositive(head.next);
    } else {
      return countPositive(head.next);
    }
  }
}
