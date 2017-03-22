import java.util.Arrays;

/**
 * Created by zsuzsanna.padar on 2017. 03. 22..
 */
public class Exercise17SwapElement {
  public static void main(String[] args){
    String [] abc = {"first", "second", "third"};

    String swap1 = abc[0];
    String swap2 = abc[2];
    abc [0] = swap2;
    abc [2] = swap1;

    System.out.println(Arrays.toString(abc));
  }

}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
