package CreateClasses;

public class anExample {
  public static void main(String[] args) {
    System.out.println("Now shows an example of several classes that create a class.");
    Classes classes = new Classes("counselorList.txt", "teachersList1.txt", "stusList.txt");
    classes.printClassInfo();
  }
}
