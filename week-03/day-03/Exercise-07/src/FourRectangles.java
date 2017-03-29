import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class FourRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.GREEN);
    graphics.fillPolygon(new int[] {4, 16, 20}, new int[] {0, 20, 20}, 3);

    graphics.setColor(Color.YELLOW);
    graphics.fillPolygon(new int[] {80, 40, 70}, new int[] {0, 30, 30}, 3);

    graphics.setColor(Color.RED);
    graphics.fillPolygon(new int[] {189, 72, 98}, new int[] {0, 40, 40}, 3);

    graphics.setColor(Color.BLUE);
    graphics.fillPolygon(new int[] {250, 180, 256}, new int[] {0, 50, 50}, 3);
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
