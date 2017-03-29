import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]
    twoSqauaresInTwoColors(16, graphics);


    /*graphics.setColor(Color.BLACK);
    for (int i = 0; i < 300; i += 16) {
      graphics.fillRect(i, i, 16, 16);

    }

    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i < 300; i += 16) {
      graphics.fillRect(i, i, 14, 14);
    } */

  }
  public static void twoSqauaresInTwoColors (int square, Graphics graphics) {
    int xy = 0;
    for (int i = 0; i < 300; i +=square) {
      graphics.setColor(Color.BLACK);
      graphics.fillRect(xy + i, xy + i, square, square);
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(xy + i + 1, xy + i +1,square - 2, square - 2);
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
