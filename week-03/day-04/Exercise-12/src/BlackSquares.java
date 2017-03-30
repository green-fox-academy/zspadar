import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 30..
 */
public class BlackSquares {
  public static void mainDraw(Graphics graphics) {

    drawBlackSquares(0, 0, 300, 6, graphics);
  }


  public static void  drawBlackSquares(int x, int y, int size, int n, Graphics graphics) {
    if (n >= 0) {
      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
          if (i % 2 != 0 && j % 2 != 0) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(size / 2 * j + x, size / 2 * i + y, size / 2, size / 2);
          } else {
            drawBlackSquares(size / 2 * j + x + 2 * x /3, size / 2 * i + y, size / 2, n-1, graphics);
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
