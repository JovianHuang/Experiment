package Shapes;

public class Ellipse extends Shapes implements Comparable<Rectangle>{
  private int a;  // semi-major axis
  private int b;  // semi-minor axis

  public Ellipse(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public double calArea() {
    return a * b * Math.PI;
  }

  public double calPerimeter() {
    return 2 * Math.PI * b + 4 * (a - b);
  }

  public int compareTo(Rectangle o) {
    if (calArea() > o.calArea()) {
      return 1;
    } else if (calArea() == o.calArea()) {
      return 0;
    } else {
      return -1;
    }
  }

  @Override
  public String toString() {
    return "The area and the perimeter of this ellipse are: " + calArea() + ", " + calPerimeter();
  }
}
