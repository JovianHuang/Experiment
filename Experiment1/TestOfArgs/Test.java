package TestOfArgs;

public class Test {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("You did not specify any parameters when you called the main method!");
      return;
    }
    System.out.println("The parameters you specify when you call the main method include: ");
    for (int i = 0; i < args.length; i++) {
      System.out.println("The value of parameters " + (i + 1) + " is: " + args[i]);
    }
  }
}
