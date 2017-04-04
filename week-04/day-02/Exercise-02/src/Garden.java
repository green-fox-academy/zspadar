
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

  public List<Integer> flowersNeedsWater(int waterAmount) {
    List<Integer> flowerThirsty = new ArrayList<>();
    for (int i = 0; i < flowers.size(); i++) {
      if (waterAmount < 5) {
        flowerThirsty.add(i);
      }
    }
    return flowerThirsty;
  }

  public List<Integer> treeNeedsWater(int waterAmount) {
    List<Integer> treeThirsty = new ArrayList<>();
    for (int i = 0; i < trees.size(); i++) {
      if (waterAmount < 10) {
        treeThirsty.add(i);
      }
    }
    return treeThirsty;
  }

  public int plantNeedsWater (int waterAmount) {
    int plantNeedsWater = treeNeedsWater(waterAmount).size() + flowersNeedsWater(waterAmount).size();
    if (plantNeedsWater == 0) {
      System.out.println("Plants do not need water");
    } else {
      waterAmount = waterAmount / plantNeedsWater;
    }
    return plantNeedsWater;
  }

  public void statusReportOnWater() {
    for (Flowers flower : flowers) {
      if (flower.getAbsorbation() < 5) {
        System.out.println("This " + flower.getColor() + " flower needs water!");
      } else {
        System.out.println("This " + flower.getColor() + " flower does not need water!");
      }
    }
    for (Trees tree : trees) {
      if (tree.getWaterAmount() < 10) {
        System.out.println("This " + tree.getColor() + " tree needs water!");
      } else {
        System.out.println("This " + tree.getColor() + " flower does not need water!");

      }
    }
  }



  public List<Integer> flowerAbsorbsWater(int absorbation, int plantNeedsWater) {
    List<Integer> flowerWaterAbsorbation = new ArrayList<>();
    for (int i = 0; i < flowers.size(); i++) {
      if (absorbation <)
    }
  }



}
