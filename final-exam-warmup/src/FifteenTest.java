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
  public void testSplitStringToTwoCharsWithEvenString() throws Exception {
    String testInput = "abcdef";
    List<String> expected = Arrays.asList("ab", "cd", "ef");
    assertEquals(expected, Fifteen.splitStringToTwoChars(testInput));
  }

  @Test
  public void testSplitStringToTwoWithOddString() throws Exception {
    String testInput2 = "abcde";
    List<String> expectedWithOdd = Arrays.asList("ab", "cd");
    assertEquals(expectedWithOdd, Fifteen.splitStringToTwoChars(testInput2));
  }

  @Test
  public void testSplitStringToTwoWithEmptyString() throws Exception {
    String testInput3 = "";
    List<String> expectedWithEmptyInput = new ArrayList<>();
    assertEquals(expectedWithEmptyInput, Fifteen.splitStringToTwoChars(testInput3));
  }
}