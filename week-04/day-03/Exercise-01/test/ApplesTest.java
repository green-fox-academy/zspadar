import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class ApplesTest {
  public Apples apples;

  @Before
  public void beforeEveryTestCase() {
    apples = new Apples();
    System.out.println("Before");
  }

  @Test
  public void getName() throws Exception {
    assertEquals("apple", apples.getName());
  }
}