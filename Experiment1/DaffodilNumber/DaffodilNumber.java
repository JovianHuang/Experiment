package DaffodilNumber;

public class DaffodilNumber {
  public static void main(String[] args) {
    System.out.println("The daffodil numbers between [100, 999] are as listed: ");
    for (int i = 100; i < 1000; i++) {
      int firstNum = i / 100;
      int secondNum = i / 10 % 10;
      int thirdNum = i % 10;
      int tmp0 = firstNum * firstNum * firstNum;
      int tmp1 = secondNum * secondNum * secondNum;
      int tmp2 = thirdNum * thirdNum * thirdNum;
      if(tmp0 + tmp1 + tmp2 == i){
        System.out.println(i);
      }
    }
  }
}
