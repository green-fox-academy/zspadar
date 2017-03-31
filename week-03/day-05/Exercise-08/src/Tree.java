import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 31..
 */
public class Tree {
  public static void mainDraw(Graphics graphics) {
    treeFractalDrawer(200, 300, -90, 5, graphics);
  }

  public static void treeFractalDrawer( int x1, int y1, double angle, int n, Graphics graphics) {
    if (n == 0) {
      return;
    } else {
      int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * n * 10 );
      int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * n * 10);
      graphics.setColor(Color.YELLOW);
      graphics.drawLine(x1, y1, x2, y2);
      treeFractalDrawer(x2,y2, angle - 65, n - 1, graphics);
      treeFractalDrawer(x2, y2, angle + 65, n - 1, graphics );

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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }
}
