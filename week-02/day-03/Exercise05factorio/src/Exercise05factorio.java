import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise05factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int ui = scanner.nextInt();
    System.out.println(factorio(ui));
  }
  public static int factorio (int numbers) {
    int result = 1;
    for (int i = 1; i < numbers + 1; i++) {
      result = result * i;
    }
    return result;
  }
}
// - Create a function called `factorio`
//   that returns it's input's factorial
