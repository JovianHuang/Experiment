package Classroom;

public class Classroom {
  public static void main(String[] args) {
    System.out.println("��ѧ��ӽ��ҿ�ʼ��");
    Teacher teacher = new Teacher("��");
    System.out.println("����" + teacher.getName() + teacher.getIdentity());
    Student student = new Student("�Ƽ�ΰ");
    System.out.println("����" + student.getIdentity() + "�������ǣ�" + student.getName());
  }
}
