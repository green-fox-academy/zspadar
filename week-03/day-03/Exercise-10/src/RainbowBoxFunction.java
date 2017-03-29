import com.sun.prism.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;


import static java.awt.Color.*;
import static javafx.scene.paint.Color.INDIGO;
import static javafx.scene.paint.Color.VIOLET;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by zsuzsanna.padar on 2017. 03. 29..
 */
public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Color [] color = {Color.RED, ORANGE, YELLOW, GREEN, BLUE, MAGENTA, PINK, ORANGE};
    for (int i = 0; i < 8; i ++) {
      fillSquare(300 - i * 300 / 8, color[i], graphics);
    }



  }
  public static void fillSquare(int sizexy, Color color, Graphics graphics) {
    graphics.fillRect(150 - sizexy / 2, 150 - sizexy /2, sizexy, sizexy);
    graphics.setColor(color);
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
