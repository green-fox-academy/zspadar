/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
import java.util.*;

public class IsInList{
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    if (list.containsAll(list.indexOf(1 ))) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}