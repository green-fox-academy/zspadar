import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.
    graphics.setColor(Color.GREEN);
    graphics.drawLine(10,10, 100, 10);
    graphics.setColor(Color.BLACK);
    graphics.drawLine(10,20, 100, 20);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(10, 10, 10, 20);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(100,10, 100, 20);
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
