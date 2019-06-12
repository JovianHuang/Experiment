package Triangle0;

import java.util.Scanner;

public class Triangle {
  private int x;
  private int y;
  private int z;

  public Triangle(int a, int b, int c) {
    this.x = a;
    this.y = b;
    this.z = c;
  }

  public double getArea() throws NotTriangleException{
    if ((x<=0||y<=0||z<=0) || (x+y<z||x+z<y||y+z<x)) {
      throw new NotTriangleException("Not an triangle.");
    }
    int semiPerimeter = x * y * z / 2;
    return Math.sqrt(semiPerimeter * (semiPerimeter - x) * (semiPerimeter - y) * (semiPerimeter - z));
  }

  public void showInfo() throws NotTriangleException{
    if ((x<=0||y<=0||z<=0) || (x+y<z||x+z<y||y+z<x)) {
      throw new NotTriangleException("Not an triangle.");
    }
    System.out.println("The length of three sides are: " + x + ", " + y +  ", " + z + ".");
    System.out.println("And the area of this triangle is: " + getArea());
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the length of sides of the triangle: ");
    int tmpX = scanner.nextInt();
    int tmpY = scanner.nextInt();
    int tmpZ = scanner.nextInt();
    scanner.close();
    Triangle triangle = new Triangle(tmpX, tmpY, tmpZ);
    try {
      triangle.showInfo();
    } catch (NotTriangleException e) {
      System.out.println(e.toString());
    }
  }
}

class NotTriangleException extends Exception {
  String message;

  public NotTriangleException(String message) {
    this.message = message;
  }

  public String toString() {
    return message;
  }
}
