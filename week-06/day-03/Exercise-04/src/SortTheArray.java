import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public class SortTheArray {
  public static void main(String[] args) {
    Integer[] numbers = {3, 5, 11, 56, 4, 34, 332};
    System.out.println(Arrays.toString(sortDescendant(numbers)));
    
  }

  public static <T extends Number> Integer[] sortDescendant(T[] numbers) {
    Arrays.sort(numbers);
    Collections.reverse(Arrays.asList(numbers));
    return (Integer[]) numbers;

  }
}
