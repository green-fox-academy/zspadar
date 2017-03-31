import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 * Created by zsuzsanna.padar on 2017. 03. 31..
 */
public class SquareGrid {
  public static void mainDraw(Graphics graphics){
    gridDrawer(0,0, 300, 6, graphics);
  }

  public static void  gridDrawer(int x, int y, int size, int n, Graphics graphics) {
    if (n == 0) {
      return;
      } else {
      graphics.setColor(Color.BLACK);
      graphics.fillRect(x + size / 4, y + size / 4, size / 2, size /2);
      graphics.setColor(Color.WHITE);
      graphics.fillRect(x + size / 4 + 5, y + size / 4 + 5, size / 2 - 10, size /2 -10);
      gridDrawer(x / 2 + size / 4, y / 2 + size / 4, size / 4, n -1, graphics);
      gridDrawer(x / 2 + size / 4 + 5, y / 2 + size / 6 + 5, size / 2 - 10, n - 1, graphics);
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
