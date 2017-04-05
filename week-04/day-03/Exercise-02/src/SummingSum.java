import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class SummingSum {
  public SummingSum() {
  }


  public int sumItUp(List<Integer> myList) {
    int sum = 0;
    if(!(myList == null))
    for (int i : myList) {
      sum = sum + i;
    }
    return sum;
  }
}
