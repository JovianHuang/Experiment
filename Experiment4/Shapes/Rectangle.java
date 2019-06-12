package Shapes;

public class Rectangle extends Shapes implements Comparable<Ellipse>{
  private int x;
  private int y;

  public Rectangle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double calArea() {
    return x * y;
  }

  public double calPerimeter() {
    return (x + y) * 2;
  }

  public int compareTo(Ellipse o) {
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
    return "The area and the perimeter of this rectangle are: " + calArea() + ", " + calPerimeter();
  }
}
