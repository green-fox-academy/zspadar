import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private Hero hero;





  public GameEngine() {
    this.gameMap = new GameMap();
    hero = new Hero(0,0, "assets/hero-down.png");
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    gameMap.fillMap();
    List<GameObject> heroList = new ArrayList<>();
    heroList.add(hero);
    gameMap.getGameObjects().add(heroList);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (List<GameObject> temp : gameMap.getGameObjects()) {
      for (GameObject temp2 : temp) {
        PositionedImage image = new PositionedImage(temp2.getCostume(), temp2.getPosX(), temp2.getPosY());
        image.draw(graphics);
      }
    }
  }
  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    GameEngine gameEngine = new GameEngine();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(gameEngine);
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    //frame.addKeyListener(gameEngine);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
      hero.moveDown();

    } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
      hero.moveLeft();

    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
      hero.moveRight();
    }
    repaint();
  }
}
