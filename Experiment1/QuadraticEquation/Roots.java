package QuadraticEquation;

public class Roots {
  private double root1;
  private double root2;
  private boolean hasRoots;

  public Roots(){
    this.hasRoots = false;
  }

  public void setRoot1(double root1) {
    this.root1 = root1;
  }

  public void setRoot2(double root2) {
    this.root2 = root2;
  }

  public void setHasRoots(boolean hasRoots) {
    this.hasRoots = hasRoots;
  }

  public double getRoot1() {
    return root1;
  }

  public double getRoot2() {
    return root2;
  }

  public boolean isHasRoots() {
    return hasRoots;
  }
}
