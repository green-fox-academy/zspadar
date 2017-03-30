import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class YellowStuff {
  public static void mainDraw(Graphics graphics) {

    drawYellowRects(0, 0, 300,  6, graphics);
    }


  public static void  drawYellowRects(int x, int y, int size, int n, Graphics graphics) {
    if (n >= 0) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (i % 2 == 0 && j % 2 == 0) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(size / 3 * j + x, size / 3 * j + y, size / 3, size / 3);
          } else {
            drawYellowRects(size / 3 * j + x, size / 3 * i + y, size / 3, n-1, graphics);
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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }
}

