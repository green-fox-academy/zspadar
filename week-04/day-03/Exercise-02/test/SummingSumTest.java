import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class SummingSumTest {

  SummingSum summingSum = new SummingSum();


  @Before
  public void beforeEachTest(){
    System.out.println("Before");
  }


  @Test
  public void testIfSumIsSum() throws Exception {
    List<Integer> myList = new ArrayList<>(Arrays.asList(12, 14, 14));
    summingSum.sumItUp(myList);
    assertEquals(40,summingSum.sumItUp(myList));
  }


  @Test
  public void testSumWithEmptyList() throws Exception {
    List<Integer> myList = new ArrayList<>(Arrays.asList());
    summingSum.sumItUp(myList);
    assertEquals(0, summingSum.sumItUp(myList));
  }

  @Test
  public void testWithOneElement() throws Exception {
    List<Integer> myList = new ArrayList<>(Arrays.asList(11));
    summingSum.sumItUp(myList);
    assertEquals(11,summingSum.sumItUp(myList));
  }

  @Test
  public void testWithMultipleElements() throws Exception {
    List<Integer> myList = new ArrayList<>(Arrays.asList(1,1,1,1));
    summingSum.sumItUp(myList);
    assertEquals(4, summingSum.sumItUp(myList));
  }

  @Test
  public void testWithNull() throws Exception {
    assertEquals(0,summingSum.sumItUp(null));
  }
}