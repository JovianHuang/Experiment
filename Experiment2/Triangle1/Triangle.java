package Triangle1;

import java.util.Scanner;

public class Triangle {
  private int x;
  private int y;
  private double a; // should between 0 to 180
  private static double totalArea = 0;

  public Triangle(int x, int y, double a) {
    this.x = x;
    this.y = y;
    this.a = a;
  }

  public double getArea() {
    double tmpArea = (x * y * Math.sin(a * Math.PI / 180)) / 2;
    totalArea += tmpArea;
    return tmpArea;
  }

  public void setA(double a) {
    this.a = a;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many triangles do you want to calculate?");
    int n = scanner.nextInt();
    Triangle[] triangles = new Triangle[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Please enter the length of the two sides of the triangle and the angle: ");
      int tmpX = scanner.nextInt();
      int tmpY = scanner.nextInt();
      double tmpA = scanner.nextDouble();
      triangles[i] = new Triangle(tmpX, tmpY, tmpA);
    }
    for (int i = 0; i < n; i++) {
      System.out.println("The area of triangle " + (i + 1) + " is: " + triangles[i].getArea());
    }
    System.out.println("The total area of those triangles is: " + Triangle.totalArea);
  }
}
