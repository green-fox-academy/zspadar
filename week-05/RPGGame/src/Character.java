/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class Character {
  private int positionX;
  private int positionY;
  private String name;

  public Character(int characterPositionX, int characterPositionY, String characterName) {
    positionX = characterPositionX;
    positionY = characterPositionY;
    name = characterName;
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
