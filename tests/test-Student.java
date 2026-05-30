import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

  void testConstructorInitializesFields() {
    Student s = new Student("Alice", 85); 
    assertEquals(85, s.passed());
  }

  void testPassingGrade() {
    Student s = new Student("Robert", 96); 
    assertEquals(96, s.passed());
  }

  void testFailingGrade() {
    Student s = new Student("Liliana", 59); 
    assertEquals(59, s.passed());
  }

  void testMixedStatusGrades() {
    Student s1 = new Student("Alex", 76); 
    Student s2 = new Student("Nathan", 57); 
    Student s3 = new Student("Ashley", 93); 

    assertEquals(76, s1.passed()); // true
    assertEquals(57, s2.passed()); // false
    assertEquals(93, s3.passed()); // true

