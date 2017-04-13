import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Character extends GameObject {
  private List<GameObject> characterList;
  private GameMap map;


  public Character(int posX, int posY, String costume, GameMap map) {
    super(posX, posY, costume);
    characterList = new ArrayList<>();
    this.map = map;
  }



  public Character() {

  }

  public List<GameObject> getCharacterList() {
    return characterList;
  }

  public void moveUp() {
    if ((GameMap.floorMap[(getPosY()/ 72   - 1)][getPosX() / 72] != 1) && (getPosY() - 72 >= 0)) {
      move(0, -72);
    }
  }

  public void moveDown (){
    if ((GameMap.floorMap[(getPosY()/ 72   +1)][getPosX() / 72] != 1) && (getPosY() + 72 < 720)) {
      move(0, +72);
    }
  }
  public void moveLeft() {
    if ((GameMap.floorMap[(getPosY()/ 72 )][getPosX() / 72 - 1] != 1) && (getPosX() -72 >= 0)) {
      move(-72, 0);
    }
  }

  public void moveRight() {
    if ((GameMap.floorMap[(getPosY()/ 72 )][getPosX() / 72 + 1] != 1) && (getPosX() + 72 < 720)) {
      move(+72, 0);
    }

  }


}
