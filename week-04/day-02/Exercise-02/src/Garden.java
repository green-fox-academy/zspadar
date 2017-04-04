
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Garden {
  private List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void status() {
    for (int i = 0; i < plants.size(); i++) {
      Plant plant = plants.get(i);
      String needsWater;
      if (plant.needsWater()) {
        needsWater = "needs water";
      } else {
        needsWater = "doesn't need water";
      }
      System.out.println("The " + plant.getName() + " " + needsWater);
    }
    System.out.println("");
  }

  private ArrayList<Plant> getWaterNeededPlants() {
    ArrayList<Plant> waterNeededPlants = new ArrayList<>();
    for (int i = 0; i < plants.size(); i++) {
      Plant plant = plants.get(i);
      if (plant.needsWater()) {
        waterNeededPlants.add(plant);
      }
    }
    return waterNeededPlants;
  }

  public void water(int amount) {
    System.out.println("Watering with " + String.valueOf(amount));
    ArrayList<Plant> waterNeededPlants = getWaterNeededPlants();
    float eachWaterAmount = amount / waterNeededPlants.size();
    for (int i = 0; i < plants.size(); i++) {
      Plant plant = plants.get(i);
      plant.water(eachWaterAmount);
    }
    status();
  }

}
