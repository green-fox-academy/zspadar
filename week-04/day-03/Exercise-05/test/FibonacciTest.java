import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class FibonacciTest {

  @Test
  public void isFibonacciWorks() throws Exception {
    Fibonacci testFibonacci = new Fibonacci();
    assertEquals(1, testFibonacci.fibonacci(3));
  }
}