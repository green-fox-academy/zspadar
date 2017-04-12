import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class Map {
  private int[] [] floorMap;
  private List<List<GameObject>> gameObjects;


  public Map(int[][] floorMap) {
    this.floorMap = new int[][] {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
    };

    this.gameObjects = new ArrayList<>(new ArrayList<>());
  }




  public int[][] getFloorMap() {
    return floorMap;
  }

  public void fillMap() {
    for (int i = 0; i < 11; i ++) {
      List<GameObject> tempArrayList = new ArrayList<>();
      gameObjects.add(tempArrayList);
      for (int j = 0; j < 10; j ++) {
        if (floorMap[i][j] == 0) {
          tempArrayList.add( new Floor(j * 72, i * 72, "assets/floor.png"));
        } else if (floorMap[i][j] == 1) {
          tempArrayList.add(new Wall(j * 72, i * 72, "assets/wall.png")) ;
        }
      }
    }
  }

}
