import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 04. 05..
 */
public class SummingSum {
  private ArrayList<Integer> myList;

  public SummingSum() {
    this.myList = new ArrayList<>();
    myList.add(54);
    myList.add(12);
    myList.add(34);
  }

  public int sumItUp() {
    int sum = 0;
    for (int i : myList) {
      sum = sum + i;
    }
    return sum;
  }

  public void addIntegers (Integer numbers) {
    myList.add(numbers);
  }

  public ArrayList<Integer> getMyList() {
    return myList;
  }



}
