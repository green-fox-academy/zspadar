/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
public interface CreditCardy {
  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount);

  String toString();
}