package CreateClasses;

public class anExample {
  public static void main(String[] args) {
    System.out.println("Now shows an example of several classes that create a class.");
    Classes classes = new Classes("CreateClasses/counselorList.txt", "CreateClasses/teachersList1.txt", "CreateClasses/stusList.txt");
    classes.printClassInfo();
  }
}
