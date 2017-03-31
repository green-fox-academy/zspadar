import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 * Created by zsuzsanna.padar on 2017. 03. 31..
 */
public class Carpet {
  public static void mainDraw(Graphics graphics){
    carpetDrawer(0,0, 300, 6, graphics);

  }
  public static void  carpetDrawer(int x, int y, int size, int n, Graphics graphics) {
    if (n >= 0) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (i == 1 && j == 1) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(size / 3 + x, size / 3  + y, size / 3, size / 3);
          } else {
            carpetDrawer(size / 3 * j + x, size / 3 * i + y, size / 3, n-1, graphics);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
