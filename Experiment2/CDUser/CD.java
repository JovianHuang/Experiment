package CDUser;

public class CD {
  private String name;
  private String sideA;
  private String sideB;

  public CD() {
    this.name = "Blank CD";
    this.sideA = "Null";
    this.sideB = "Null";
  }

  public String getName() {
    return name;
  }

  public String getSideA() {
    return sideA;
  }

  public String getSideB() {
    return sideB;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSideA(String sideA) {
    this.sideA = sideA;
  }

  public void setSideB(String sideB) {
    this.sideB = sideB;
  }
}
