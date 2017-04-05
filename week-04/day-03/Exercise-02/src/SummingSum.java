import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class SummingSum {
  private ArrayList<Integer> myList;

  public SummingSum() {
    this.myList = new ArrayList<>();
  }

  public void addIntegers (Integer numbers) {
    myList.add(numbers);
  }

  public ArrayList<Integer> getMyList() {
    return myList;
  }
  


}
