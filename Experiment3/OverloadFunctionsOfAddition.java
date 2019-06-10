public class OverloadFunctionsOfAddition {
  public static void main(String[] args) {
    System.out.println("Example 0 of addition: 3(int) + 7(int) = " + addition(3, 7));
    System.out.println("Example 1 of addition: 4.0(double) + 3.0(double) = " + addition(4.0, 3.0));
    System.out.println("Example 2 of addition: 14.0(double) + 18(int) = " + addition(14.0, 18));
  }

  private static int addition(int a, int b) {
    return a + b;
  }

  private static double addition(double a, double b) {
    return a + b;
  }

  private static int addition(double a_d, int b_i) {
    return ((int)a_d + b_i);
  }
}
