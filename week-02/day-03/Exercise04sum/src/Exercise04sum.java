import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise04sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int ui = scanner.nextInt();
    System.out.println(sum(ui));
  }
  public static int sum(int numbers) {
    int result = 0;
    for ( int i = 0; i < numbers; i ++) {
      result = result + i;
    }
    return result;
  }
}
// - Write a function called `sum` that sum all the numbers
//   until the given parameter