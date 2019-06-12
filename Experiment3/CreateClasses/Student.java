package CreateClasses;

import jovian.selfmade.Person;

public class Student extends Person {
  private String major;

  public Student(String name, String gender, int age, String major) {
    super(name, gender, age);
    this.major = major;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void printStuInfo() {
    printPersonInfo();
    System.out.println(this.major);
  }
}
