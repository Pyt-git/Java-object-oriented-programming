public class Student {
  String name;
  int grade; 

  public Student(String n, int g) {
    name = n;
    grade = g; 
  }

  public boolean passed() {
    return grade >= 60; 
  }
}
