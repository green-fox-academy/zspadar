import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.tools.doclint.Entity.image;

/**
 * Created by zsuzsanna.padar on 2017. 04. 11..
 */
public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  String heroImage;
  int tileSize;
  int[][] floorMap = new int[][] {
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

  public int[][] getFloorMap() {
    return floorMap;
  }

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    heroImage = "assets/hero-down.png";
    tileSize = 72;


    // set the size of your draw board
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    //graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.





    for (int i = 0; i < 11; i ++) {
      for (int j = 0; j < 10; j ++) {
        if (floorMap[i][j] == 0) {
          PositionedImage floor = new PositionedImage("assets/floor.png", j * tileSize, i * tileSize);
          floor.draw(graphics);
        } else if (floorMap[i][j] == 1) {
          PositionedImage wall = new PositionedImage("assets/wall.png", j  * tileSize, i *tileSize);
          wall.draw(graphics);
        }
      }
    }

    PositionedImage hero = new PositionedImage(heroImage, testBoxX, testBoxY);
    hero.draw(graphics);

  }



  public static void boardMain() {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener

  }




  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP &&  0 < testBoxY ) {
      heroImage = "assets/hero-up.png";
      if (floorMap[(testBoxY / 72 - 1)][testBoxX / 72] != 1) {
        testBoxY -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN &&  testBoxY < 720) {
      heroImage= "assets/hero-down.png";
      if (floorMap[testBoxY / 72 + 1] [testBoxX / 72] != 1) {
        testBoxY += 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && 0 < testBoxX ) {
      heroImage = "assets/hero-left.png";
      if (floorMap[testBoxY / 72 ] [testBoxX / 72 -1] != 1) {
        testBoxX -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && testBoxX < 648) {
      heroImage = "assets/hero-right.png";
      if (floorMap[testBoxY / 72 ] [testBoxX / 72 +1] != 1) {
        testBoxX += 72;
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
