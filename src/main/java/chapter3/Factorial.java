package chapter3;

public class Factorial {

  public static void main(String[] args) {
    int num = 5;
    System.out.println("Factorial " + num + " = " + getFactorial(num));
  }

  private static int getFactorial(int num) {
    if (num == 1) {
      return num;
    }
    return num * getFactorial(num - 1);
  }
}
