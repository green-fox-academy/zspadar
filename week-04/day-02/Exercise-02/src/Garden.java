
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Garden {
  private List<Flowers> flowers;
  private List<Trees> trees;

  public Garden() {
    flowers = new ArrayList<>();
    trees = new ArrayList<>();

  }

  public void addFlower(Flowers flower) {
    flowers.add(flower);
  }

  public void addTree(Trees tree) {
    trees.add(tree);
  }

  public int FlowersNeedsWater(int waterAmount) {
    int flowerThirsty = 0;
    for (int i = 0; i < flowers.size(); i++) {
      if (waterAmount < 5) {
        flowerThirsty += 1;
      }
    }
    return flowerThirsty;
  }
  public int TreeNeedsWater(int waterAmount) {
    int treeThirsty = 0;
    for (int i = 0; i < trees.size(); i++) {
      if (waterAmount < 10) {
        treeThirsty += 1;
      }
    }
  }


}
