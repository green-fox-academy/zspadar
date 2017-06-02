/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
public class CreditCardApp {
  public static void main(String[] args) {
    CreditCard creditCard = new CreditCard("ABC0", "3456");
    CreditCard creditCard2 = new CreditCard("ABC1", "7777");
    CreditCard creditCard3 = new CreditCard("ABC2", "3990");
    System.out.println(creditCard.toString());
    System.out.println(creditCard2.toString());
    System.out.println(creditCard3.toString());
  }
}
