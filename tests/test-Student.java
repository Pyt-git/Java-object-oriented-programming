import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

  void testConstructorInitializesFields() {
    Student s = new Student("Alice", 85); 
    assertEquals("Alice", s.name);
    assertEquals(85, s.grade);
  }

  void testPassingGrade() {
    Student s = new Student("Robert", 96); 
    assertTrue(s.passed());
  }

  void testFailingGrade() {
    Student s = new Student("Liliana", 59); 
    assertFalse(s.passed());
  }

  void testMixedStatusGrades() {
    Student s1 = new Student("Alex", 76); 
    Student s2 = new Student("Nathan", 57); 
    Student s3 = new Student("Ashley", 93); 

    assertTrue(s1.passed()); // true
    assertFalse(s2.passed()); // false
    assertTrue(s3.passed()); // true

  void testBoundaryGrade() {
    Student s = new Student("Dana", 60); 
    assertTrue(s1.passed()); 
  }
}

