import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]
    twoSqauaresInTwoColors3D(16, graphics);
  }

  public static void twoSqauaresInTwoColors3D (int square, Graphics graphics) {
    int xy = 0;
    for (int i = 0; i < 300; i += square) {
      int coordinates = xy + i;
      graphics.setColor(Color.BLACK);
      graphics.fillRect(coordinates, coordinates, square, square);
      graphics.setColor(Color.MAGENTA);
      graphics.fillRect(coordinates + 1, coordinates +1,square - 2, square - 2);
      square += square;
      coordinates += square;
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
