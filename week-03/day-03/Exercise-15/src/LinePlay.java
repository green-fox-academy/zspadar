import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class LinePlay {
  public static void mainDraw(Graphics graphics){
    for (int i = 0; i < 300; i+= 15) {
      linePlay(i, graphics);
    }

  }
  public static void linePlay (int diff, Graphics graphics) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine( 0, diff, diff, 300);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine( diff, 0, 300, diff );
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
