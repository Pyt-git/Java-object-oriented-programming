import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Node {

  void testSinglePositiveNode() {
    Node head = new Node(5, null);
    assertEquals(1, Node.countPositive(head));
  }

  void testSingleNegativeNode() {
    Node head = new Node(-3, null);
    assertEquals(1, Node.countPositive(head));
  }

  void testMultiplesMixedValues() {
    Node n3 = new Node(-1, null); 
    Node n2 = new Node(9, n3);
    Node n1 = new Node(-4, n2);
    Node head = new Node(10, n1);

    assertEquals(2, countPositive(head));
  }

  void testAllNegatives() {
    Node n3 = new Node(-1, null);
    Node n2 = new Node(-9, n3);
    Node n1 = new Node(-74, n2); 
    Node head = new Node(-3, n1);

    assertEquals(0, Node.countPositive(head)); 
  }

  void testEmptyList() {
    Node head = null; 
    assertEquals(0, Node.countPositive(head));
  }
}
    

