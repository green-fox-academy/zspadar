import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Fleet {
  private ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}