package Shapes;

public class test {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(3, 4);
    Ellipse ellipse = new Ellipse(3, 4);
    System.out.println(rectangle.toString());
    System.out.println(ellipse.toString());
    System.out.println(rectangle.compareTo(ellipse));
  }
}
