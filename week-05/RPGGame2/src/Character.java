/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Character extends GameObject {

  public Character() {
    super();
  }



  public void moveUp (){
    if (GameMap.floorMap[(getPosY()/ 72   - 1)][getPosX() / 72] != 1) {
      getPosY() -= 72;

  }

  public void moveDown (){

  }
  public void moveLeft() {

  }

  public void moveRight() {

  }


}
