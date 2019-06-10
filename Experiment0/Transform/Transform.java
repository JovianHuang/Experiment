package Transform;

public class Transform {
  public static void main(String[] args) {
    Transform0();
    Transform1();
  }

  private static void Transform0() {
    int a_int = 100;
    double b_double;
    b_double = a_int;
    System.out.println("a_int: " + a_int);
    System.out.println("b_double: " + b_double);
    System.out.println();
  }

  private static void Transform1() {
    double a_double = 12345.6789;
    float b_float = (float)a_double;
    System.out.println("a_int: " + a_double);
    System.out.println("b_double: " + b_float);
    System.out.println();
  }
}
