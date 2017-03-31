import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 * Created by zsuzsanna.padar on 2017. 03. 31..
 */
public class Triangle{
  public static void mainDraw(Graphics graphics) {
    triangleFractalDrawer(0, 0, 300,  7, graphics);
  }

  public static void triangleFractalDrawer(int x, int y, int size, int n, Graphics graphics) {
    if (n == 0 ) {
      return;
    }

    graphics.drawLine(x, y, x + size, y);
    graphics.drawLine(x, y, x + size / 2, y + size);
    graphics.drawLine(x + size / 2, y + size, x + size, y);
//    graphics.drawLine(x + size / 2, y, x + size / 4, y + size / 2);
//    graphics.drawLine(x + size / 4, y + size / 2, x + 3 * size / 4, y + size / 2);
//    graphics.drawLine(x + 3 * size /4, y + size / 2, x + size / 2, y);

    triangleFractalDrawer( x, y, size / 2,n-1, graphics);
    triangleFractalDrawer(x + size / 2, y, size / 2, n -1, graphics);
    triangleFractalDrawer(x + size / 4, y + size / 2, size / 2, n - 1, graphics);
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

