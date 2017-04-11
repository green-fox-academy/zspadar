/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class BadGuy {
  private int positionX;
  private int positionY;
  private String name;

  public BadGuy(int badGuyPositionX, int badGuyPositionY, String badGuyName) {
    positionX = badGuyPositionX;
    positionY = badGuyPositionY;
    name = badGuyName;
  }

  public int getPositionX() {
    return positionX;
  }

  public int getPositionY() {
    return positionY;
  }

  public String getName() {
    return name;
  }
}
