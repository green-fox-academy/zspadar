/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Hero extends Character {
  private int posX;
  private int posY;
  private String costume;

  public Hero(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  @Override
  public void moveUp() {
    super.moveUp();
    setCostume("assets/hero-up.png");
  }

  @Override
  public void moveDown() {
    super.moveDown();
    setCostume("assets/hero-down.png");
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    setCostume("assets/hero-left.png");
  }

  @Override
  public void moveRight() {
    super.moveRight();
    setCostume("assets/hero-right.png");
  }
}
