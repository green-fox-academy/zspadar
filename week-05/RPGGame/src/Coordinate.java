import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class Coordinate {
  private List<Coordinate> coordinates;



  public Coordinate() {
  }

  Board board = new Board();

  public List<List<Integer>> createRandomFloorCoordinates (int randomX, int randomY) {
    List<List<Integer>> listOfGoodCoordinates = new ArrayList<List<Integer>>();
    for (int i = 0; i < board.getFloorMap().length; i++) {
      for (int j = 0; j < board.getFloorMap()[i].length; j++) {
        int position = board.getFloorMap()[i][j];
        if (position == 0) {
          listOfGoodCoordinates.add(Arrays.asList(board.getFloorMap()[i][j]));
        }
      }
    }
    return listOfGoodCoordinates;
  }
}
