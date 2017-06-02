/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Main {
  public static <T extends Number> double add(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
  }

  public  static <T extends Number> double subtract(T num1, T num2) {
    return num1.doubleValue() - num2.doubleValue();
  }

  public static <T extends Number> double multiply(T num1, T num2) {
    return num1.doubleValue() * num2.doubleValue();
  }

  public static <T extends Number> double divide(T num1, T num2) {
    if (num2.doubleValue() == 0) {
      throw new ArithmeticException("Division by 0 is not a thing!");
    }
    else {
      return num1.doubleValue() / num2.doubleValue();
    }
  }

}
