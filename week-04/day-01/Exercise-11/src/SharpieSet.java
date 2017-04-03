import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class SharpieSet {
  List<Sharpie> sharpies = new ArrayList<>();

  public void addSharpies (Sharpie sharpie) {
    sharpies.add(new Sharpie());
  }

  public int countUsable() {
    int count = 0;
    for (int i = 0; i < sharpies.size(); i++){
      if (sharpies.get(i).inkAmount != 0) {
        count++;
      }
    }
    return count;
  }
  public void removeTrash(){
    List<Sharpie> trash = new ArrayList<>();
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount == 0) {
        trash.add(sharpies.get(i));
      }
    }
    sharpies.removeAll(trash);

}
