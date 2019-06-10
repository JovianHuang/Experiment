package Classroom;

public class Student {
  private String identity;
  private String name;

  public Student(String name) {
    this.identity = "学生";
    this.name = name;
  }

  public String getIdentity() {
    return identity;
  }

  public String getName() {
    return name;
  }
}
