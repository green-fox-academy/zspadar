import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Garden {
  public List <Flowers> flowers;
  public List <Trees> trees;


  public int waterAmount;
  public double absorbation;
  

  Garden () {
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();

  }

  public void addFlower(Flowers flowers) {
    flowers.addFlower(flowers);
  }

  public void addTree(Trees trees) {
    trees.addTree(trees);
  }

}
