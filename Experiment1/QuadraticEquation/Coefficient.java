package QuadraticEquation;

import java.util.Scanner;

public class Coefficient {
  private int zeroPowerTerm;
  private int firstPowerTerm;
  private int secondPowerTerm;

  public Coefficient() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the coefficients of this equation as required.");
    System.out.print("The Coefficient of the second power term: ");
    this.secondPowerTerm = scanner.nextInt();
    System.out.print("The Coefficient of the first power term: ");
    this.firstPowerTerm = scanner.nextInt();
    System.out.print("The Coefficient of the zero power term: ");
    this.zeroPowerTerm = scanner.nextInt();
    scanner.close();
  }

  public int getZeroPowerTerm() {
    return zeroPowerTerm;
  }

  public int getFirstPowerTerm() {
    return firstPowerTerm;
  }

  public int getSecondPowerTerm() {
    return secondPowerTerm;
  }
}
