/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class Skeleton extends Character {
  private int positionX;
  private int positionY;
  private String name;

  public Skeleton(int positionX, int positionY, String name) {
    super(positionX, positionY, name);
  }

  @Override
  public int getPositionX() {
    return positionX;
  }

  @Override
  public int getPositionY() {
    return positionY;
  }

  @Override
  public String getName() {
    return name;
  }
}
