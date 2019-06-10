package jovian.selfmade;

import java.util.Scanner;

public abstract class Person {
  private String name;
  private Gender gender = new Gender("unknown");
  private int age;

  public Person(String name, String genderStr, int age) {
    this.name = name;
    this.gender.setGender(genderStr);
    this.age = age;
  }

  public Person() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the name: ");
    this.name = sc.nextLine();
    System.out.print("Please enter the gender: ");
    gender.setGender(sc.nextLine());
    System.out.print("Please enter the age: ");
    this.age = Integer.parseInt(sc.nextLine());
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

  public void resetName(String name) {
    this.name = name;
  }

  public void resetGender(String genderStr) {
    this.gender.setGender(genderStr);
  }

  public void resetAge(int age) {
    this.age = age;
  }

//  protected void printPersonInfo() {
//    System.out.print("Name: " + this.getName() + ", Gender: " + this.getGender() + ", Age: " + this.getAge());
//  }
  protected void printPersonInfo() {
    System.out.print(this.getName() + "\t" + this.getGender() + "\t" + this.getAge());
  }
}

