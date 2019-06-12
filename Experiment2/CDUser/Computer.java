package CDUser;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Computer {
  private CD includeCD;
  private boolean isExitingCD;

  public Computer() {
    this.isExitingCD = false;
  }

  public boolean isExitingCD() {
    return isExitingCD;
  }

  private boolean stupidEnsure() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String selected = scanner.nextLine();
      if (selected.length() > 1) {
        System.out.println("Illegal input! Try again.");
      } else {
        if (selected.toUpperCase().equals("Y")) {
          return true;
        } else if (selected.toUpperCase().equals("N")) {
          return false;
        }
      }
    }
  }

  public void pushCD() {
    this.includeCD = new CD();
    this.isExitingCD = true;
    System.out.println("CD have been pushed in.");
  }

  public void popCD() {
    this.isExitingCD = false;
    System.out.println("CD have been popped out.");
  }

  public boolean burnCD() {
    if (isExitingCD) {
      System.out.println("Do you want to burn this CD? (Y/N)");
      if (stupidEnsure()) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("New name: ");
        includeCD.setName(scanner.nextLine());
        System.out.print("New content of side A: ");
        includeCD.setSideA(scanner.nextLine());
        System.out.print("New content of side B: ");
        includeCD.setSideB(scanner.nextLine());
        scanner.close();
        return true;
      }
    }
    return false;
  }

  public void displayAll() {
    if (isExitingCD()) {
      System.out.println("CD name: " + includeCD.getName());
      System.out.println("The content of side A: ");
      System.out.println(includeCD.getSideA());
      System.out.println("The content of side B: ");
      System.out.println(includeCD.getSideB());
      System.out.println();
    } else {
      System.out.println("CD can't be found.");
    }
  }
}
