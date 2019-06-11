package QuadraticEquation;

public class QuadraticEquation {
  private Coefficient coefficient;
  private Roots roots;

  public QuadraticEquation() {
    this.coefficient = new Coefficient();
    this.roots = new Roots();
    solveEquation();
  }

  private void solveEquation() {
    int a = coefficient.getSecondPowerTerm();
    int b = coefficient.getFirstPowerTerm();
    int c = coefficient.getZeroPowerTerm();
    int delta = b * b - 4 * a * c;
    if (delta < 0) {
      roots.setHasRoots(false);
    } else {
      roots.setHasRoots(true);
      roots.setRoot1((-b + Math.sqrt(delta)) / (2 * a));
      roots.setRoot2((-b - Math.sqrt(delta)) / (2 * a));
    }
  }

  public void displayEquation() {
    System.out.print("Here is the equation: ");
    System.out.println(coefficient.getSecondPowerTerm() + "x^2 + " + coefficient.getFirstPowerTerm() + "x + "
        + coefficient.getZeroPowerTerm() + " = 0");
  }

  public void displayResult() {
    if (roots.isHasRoots()) {
      System.out.println("The roots of this equation are " + roots.getRoot1() + " and " + roots.getRoot2());
    } else {
      System.out.println("This equation has no roots.");
    }
  }

  public static void main(String[] args) {
    QuadraticEquation equation = new QuadraticEquation();
    equation.displayEquation();
    equation.displayResult();
  }
}
