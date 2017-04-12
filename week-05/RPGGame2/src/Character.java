/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Character extends GameObject {

  public Character() {
    super();
  }



  public void moveUp (){
    if (GameMap.floorMap[(getPosY()/ 72   - 1)][getPosX() / 72] != 1) {
      move(0, -72);
    }
  }

  public void moveDown (){
    if (GameMap.floorMap[(getPosY()/ 72   +1)][getPosX() / 72] != 1) {
      move(0, +72);
    }
  }
  public void moveLeft() {
    if (GameMap.floorMap[(getPosY()/ 72 )][getPosX() / 72 - 1] != 1) {
      move(-72, 0);
    }
  }

  public void moveRight() {
    if (GameMap.floorMap[(getPosY()/ 72 )][getPosX() / 72 - 1] != 1) {
      move(+72, 0);
    }

  }


}
