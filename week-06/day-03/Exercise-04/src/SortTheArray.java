import java.util.Arrays;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public class SortTheArray {
  public static void main(String[] args) {
    int[] numbers = {3, 5, 11, 56, 4, 34, 332};
    System.out.println(sortDescendant(numbers));

  }

  public static <T extends Number> int[] sortDescendant(T[] numbers) {
    int[] descendantNumbers = new int[numbers.length];
    Arrays.sort(numbers);
    for(int i = 0; i < numbers.length; i++) {
      descendantNumbers[i] = numbers.length - 1;
    }
    return descendantNumbers;

  }
}
