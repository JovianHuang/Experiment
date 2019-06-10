package Alphabet;

public class Alphabet {
  public static void main(String[] args) {
    int i = 'A';
    while (i <= 'Z') {
      System.out.print((char) i++ + " ");
    }
    System.out.print("\n");
    i = 'a';
    for (int j = 0; j < 26; j++, i++) {
      System.out.print((char)i + " ");
    }
  }
}
