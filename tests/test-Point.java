import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

  void testConstructorInitializesFields() {
    Point p = new Point(3, 4);
    assertEquals(3, p.x);
    assertEquals(4, p.y);
  }

  void testMoveChangesCoordinates() {
    Point p = new Point(1, 2);
    p.move(6, 5);

    assertEquals(7, p.x);
    assertEquals(7, p.y); 
  }

  void testMultipleMoves() {
    Point p = new Point(2, -3); 
    p.move(2, 3); // (4, 0)
    p.move(0, -7); // (4, -7)

    assertEquals(4, p.x); 
    assertEquals(-7, p.y);
  }
}
    

