import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zsuzsanna.padar on 2017. 07. 10..
 */
public class FifteenTest {
  @Before
  public void before() {
    System.out.println("Before");
  }

  @Test
  public void testSplitStringToTwoLettersWithEvenString() throws Exception {
    String testInput = "abcdef";
    List<String> expected = Arrays.asList("ab", "cd", "ef");
    assertEquals(expected, Fifteen.splitStringToTwoLetters(testInput));
  }

  @Test
  public void testSplitStringToTwoLettersWithOddString() throws Exception {
    String testInput2 = "abcde";
    List<String> expectedWithOdd = Arrays.asList("ab", "cd");
    assertEquals(expectedWithOdd, Fifteen.splitStringToTwoLetters(testInput2));
  }

  @Test
  public void testSplitStringToTwoLettersWithEmptyString() throws Exception {
    String testInput3 = "";
    List<String> expectedWithEmptyInput = new ArrayList<>();
    assertEquals(expectedWithEmptyInput, Fifteen.splitStringToTwoLetters(testInput3));
  }
}