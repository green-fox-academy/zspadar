import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    for (int i = 0; i < 150; i += 15) {
      linePlayQuaters(i, graphics);
    }
  }


  public static void linePlayQuaters (int diff, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine( 0, diff, diff, 150);
    graphics.drawLine(150, diff, diff + 150, 150);
    graphics.drawLine(0, diff + 150, diff, 300);
    graphics.drawLine(150, diff + 150, diff + 150, 300);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine( diff, 0, 150, diff );
    //graphics.drawLine();
    //graphics.drawLine();
    //graphics.drawLine();
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
