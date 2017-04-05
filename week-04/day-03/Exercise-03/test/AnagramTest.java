import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class AnagramTest {
  Anagram anagram;

  @Before
  public void beforeEveryTest() {
    System.out.println("Before");
  }


  @Test
  public void isAnagramTrue() throws Exception {
    assertTrue(anagram.isAnagram("dog", "god"));
  }

  @Test
  public void isAnagramFalse() throws Exception {
    assertFalse(anagram.isAnagram("green", "fox"));
  }
}