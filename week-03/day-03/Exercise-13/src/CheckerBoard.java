import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    chessPattern( 15, graphics);
  }
  
  public static void chessPattern(int squaresize, Graphics graphics) {
    //int xy = 0;
    for (int i = 0; i < 300; i += squaresize) {
      for (int j = 0; j < 300; j += (2 * squaresize)) {
        if (i % (2 * squaresize) == 0) {
          graphics.setColor(Color.BLACK);
          graphics.fillRect(j, i, squaresize, squaresize);
          graphics.setColor(Color.YELLOW);
          graphics.fillRect(j + squaresize , i  , squaresize, squaresize);
        } else {
          if (j % (2 * squaresize) == 0 ) {
            graphics.setColor(Color.YELLOW);
            graphics.fillRect(j, i, squaresize, squaresize);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(j + squaresize , i  , squaresize, squaresize);
          }
        }
      }
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
