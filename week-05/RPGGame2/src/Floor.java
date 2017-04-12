/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Floor extends Tile {
  private int posX;
  private int posY;
  private String costume;

  public Floor(int posX, int posY, String costume) {
   super(posX, posY, costume);
  }

  public boolean isClear() {
    return true;
  }
}
