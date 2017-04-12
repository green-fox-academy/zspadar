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
    setCostume("assets/hero-up.png");
  }

  @Override
  public void moveDown() {
    setCostume("assets/hero-down.png");
  }

  @Override
  public void moveLeft() {
    setCostume("assets/hero-left.png");
  }

  @Override
  public void moveRight() {
    setCostume("assets/hero-right.png");
  }
}
