package jovian.selfmade;

import java.util.Scanner;

public class Person {
  private String name;
  private Gender gender = new Gender("unknown");
  private int age;

  public Person(String name, String genderStr, int age) {
    this.name = name;
    this.gender.setGender(genderStr);
    this.age = age;
  }

  private String getName() {
    return name;
  }

  private String getGender() {
    return gender.gender();
  }

  private int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String genderStr) {
    this.gender.setGender(genderStr);
  }

  public void setAge(int age) {
    this.age = age;
  }

  protected void printPersonInfo() {
    System.out.print(this.getName() + "\t" + this.getGender() + "\t" + this.getAge() + "\t");
  }
}

