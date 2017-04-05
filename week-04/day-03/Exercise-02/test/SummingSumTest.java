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
    List<Integer> myList = new ArrayList<>(Arrays.asList(12,14,14));
    summingSum.sumItUp(myList);
    assertEquals(summingSum.sumItUp(myList), 40);




  }
}