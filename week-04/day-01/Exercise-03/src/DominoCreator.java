import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class DominoCreator {
  public static List<Domino> dominoCreator (List<Domino> domino) {
    Domino changed = new Domino(0,0);
    for (int i = 0; i < domino.size(); i ++) {
      for (int j = i + 1; j < domino.size(); j++){
        if (domino.get(i).getValues()[1] == domino.get(j).getValues()[0]) {
         changed = domino.get(i + 1);
         domino.set(i+1, domino.get(j));
         domino.set(j, changed);
        }
        }
      }
    return domino;
  }
}

