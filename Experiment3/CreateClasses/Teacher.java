package CreateClasses;

import jovian.selfmade.Person;

public class Teacher extends Person {
  private String duties;

  public Teacher(String name, String gender, int age, String duties) {
    super(name, gender, age);
    this.duties = duties;
  }

  public String getDuties() {
    return duties;
  }

  public void setDuties(String duties) {
    this.duties = duties;
  }

  public void printTeaInfo() {
    printPersonInfo();
    System.out.println(this.duties);
  }
}
