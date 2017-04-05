import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class CountLettersTest {


  @Test
  public void testLetterCounter() throws Exception {
    CountLetters countLetters = new CountLetters();
    HashMap<String, Integer> testMap = new HashMap<>();
    testMap.put("i", 2);
    testMap.put("k", 1);
    testMap.put("j", 1);
    testMap.put("h", 1);
    testMap.put("t", 3);
    assertEquals(testMap, countLetters.letterCounter("iikjhttt"));
  }
}