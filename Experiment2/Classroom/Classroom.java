package Classroom;

public class Classroom {
  public static void main(String[] args) {
    System.out.println("教学活动从教室开始。");
    Teacher teacher = new Teacher("张");
    System.out.println("我是" + teacher.getName() + teacher.getIdentity());
    Student student = new Student("黄键伟");
    System.out.println("我是" + student.getIdentity() + "，名字是：" + student.getName());
  }
}
