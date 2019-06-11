package CDUser;

public class User {
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.pushCD();
    computer.displayAll();
    computer.burnCD();
    computer.displayAll();
    computer.popCD();
    computer.displayAll();
  }
}
