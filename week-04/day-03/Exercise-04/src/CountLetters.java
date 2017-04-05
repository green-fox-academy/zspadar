import java.util.HashMap;
import java.util.Map;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class CountLetters {
  CountLetters () {
  }

  public HashMap <String, Integer> letterCounter(String word) {
    HashMap<String, Integer> myLetterCounter = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      if (myLetterCounter.containsKey(word.substring(i, i + 1))) {
        word.substring(i, i + 1);
        myLetterCounter.put(word.substring(i, i + 1), myLetterCounter.get(word.substring(i, i + 1)) + 1);
      } else {
        myLetterCounter.put(word.substring(i, i + 1), 1);
      }
    }
    return myLetterCounter;
  }

  public static void main(String[] args) {
    CountLetters manyLetters = new CountLetters();
    System.out.println(manyLetters.letterCounter("iikjhttt"));
  }
}
