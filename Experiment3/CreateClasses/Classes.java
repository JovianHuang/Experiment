package CreateClasses;

import Classroom.Student;
import Classroom.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class Classes {
  private Teacher counselor;
  private Teacher[] teachers;
  private Student[] students;

  public Classes(String counselorFile, String teacherFile, String studentFile) {
    this.counselor = CreateCounselor(counselorFile);
    this.teachers = CreateTeasList(teacherFile);
    this.students = CreateStusList(studentFile);
  }

  public void printClassInfo() {
    System.out.println("Here is the info of counselor: ");
    System.out.println("");
    printCounselor();
    System.out.println("");
    System.out.println("Here is the infos of teachers: ");
    printTeasList();
    System.out.println("");
    System.out.println("Here is the infos of students: ");
    printStusList();
  }

  private String[][] getInfoFromFile(String filename) {
    String token;
    String[] tmpArray0;
    String[][] tmpArray1;
    try {
      Scanner infile = new Scanner(new File("./Experiment/3/CreateClasses/" + filename)).useDelimiter(",\\s*");
      List<String> tmp = new ArrayList<>();
      while (infile.hasNext()) {
        token = infile.nextLine();
        tmp.add(token);
      }
      infile.close();
      tmpArray0 = tmp.toArray(new String[0]);
      tmpArray1 = new String[tmpArray0.length][];
      for (int i = 0; i < tmpArray0.length; i++) {
        tmpArray1[i] = tmpArray0[i].split("[\\s]+");
      }
      return tmpArray1;
    } catch (FileNotFoundException e) {
      printStackTrace();
      return null;
    }
  }

  private Teacher CreateCounselor(String filename) {
    Teacher tea = null;
    String[][] tmpArray = getInfoFromFile(filename);
    for (String[] element: tmpArray) {
      tea = new Teacher(element[0], element[1], Integer.parseInt(element[2]), element[3]);
    }
    return tea;
  }

  private Teacher[] CreateTeasList(String filename) {
    String[][] tmpArray = getInfoFromFile(filename);
    Teacher[] teaList = new Teacher[tmpArray.length];
    try {
        for (int i = 0; i < tmpArray.length; i++) {
          teaList[i] = new Teacher(tmpArray[i][0], tmpArray[i][1], Integer.parseInt(tmpArray[i][2]), tmpArray[i][3]);
        }
      } catch (NullPointerException e) {
        printStackTrace();
      }
    return teaList;
  }

  private Student[] CreateStusList(String filename) {
    String[][] tmpArray = getInfoFromFile(filename);
    Student[] stuList = new Student[tmpArray.length];
    for (int i = 0; i < tmpArray.length; i++) {
      stuList[i] = new Student(tmpArray[i][0], tmpArray[i][1], Integer.parseInt(tmpArray[i][2]), tmpArray[i][3]);
    }
    return stuList;
  }

  private void printCounselor() {
    System.out.println("Name\t\tGender\tAge\tDuties");
    this.counselor.printTeaInfo();
  }

  private void printTeasList() {
    System.out.println("Name\t\tGender\tAge\tDuties");
    for (Teacher element: teachers) {
      element.printTeaInfo();
    }
  }

  private void printStusList() {
    System.out.println("Name\tGender\tAge\tMajor");
    for (Student element: students) {
      element.printStuInfo();
    }
  }
}
