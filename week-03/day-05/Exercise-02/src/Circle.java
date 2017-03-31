import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class Circle{
  public static void mainDraw(Graphics graphics) {
    circleFractalDrawer(0, 0, 150, 300, 6, graphics);
  }

  public static void circleFractalDrawer(int x, int y, int r, int size, int n, Graphics graphics) {
   if (n == 0 ) {
      return;
    }
    int diameter = 2 * r;

    graphics.drawOval(x + size / 2 - r, y + size / 2 - r , diameter, diameter);
    graphics.drawOval(x + size / 2 - r / 2, y + size / 4 - r / 2, diameter / 2, diameter / 2);
    graphics.drawOval(x + size / 4 - r / 2, y + 3 * size / 4 - r / 2, diameter / 2, diameter / 2);
    graphics.drawOval(x + 3 * size / 4 - r / 2, y + 3 * size / 4 - r / 2, diameter / 2 , diameter / 2);
    circleFractalDrawer(x + size / 2 - r / 2, y + size / 4 - r /2 , r /2, size / 2, n -1, graphics);
    circleFractalDrawer(x + size / 4 - r / 2, y + 3 * size / 4 - r / 2, r / 2, size / 2, n -1, graphics);
    circleFractalDrawer(x + 3 * size / 4 - r / 2, y + 3 * size / 4 - r / 2, r /2, size / 2, n - 1, graphics);
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

