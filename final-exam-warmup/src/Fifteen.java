import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 07. 10..
 */

public class Fifteen {
  public static void main(String[] args) {
    System.out.println(splitStringToTwoChars("abcdef"));
  }

  public static List<String> splitStringToTwoChars(String input) {
    String tempWord = "";
    int tempNumber = 0;
    List<String> splittedList = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      tempNumber++;
      tempWord += input.charAt(i);
      if (tempNumber % 2 == 0) {
        splittedList.add(tempWord);
        tempWord = "";
      }
    }
    return splittedList;
  }

}

