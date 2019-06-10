package Classroom;

public class Teacher {
  private String identity;
  private String name;

  public Teacher(String name) {
    this.identity = "老师";
    this.name = name;
  }

  public String getIdentity() {
    return identity;
  }

  public String getName() {
    return name;
  }
}
