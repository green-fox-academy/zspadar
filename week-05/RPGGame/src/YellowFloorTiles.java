import java.awt.*;

/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class YellowFloorTiles {
  public static void mainTiles(Graphics graphics) {
    drawYellowFloorTiles(72, graphics);
  }
  public static void drawYellowFloorTiles (int tileSize, Graphics graphics) {
    for (int i = 0; i < 720; i += tileSize) {
      for ( int j = 0; j < 792; j += tileSize) {
        PositionedImage floor = new PositionedImage("assets/floor.png", 0,0);
        floor.draw(graphics);
      }
    }
  }
}
