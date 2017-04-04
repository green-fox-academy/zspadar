/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Plant {
  private String color;
  private int optimalWaterAmount;
  private int absorb;
  private String type;

  private float currentWaterAmount;

  Plant(String color, int waterAmount, int absorbation, String type) {
    this.color = color;
    this.absorb = absorbation;
    this.optimalWaterAmount = waterAmount;
    this.currentWaterAmount = 0;
    this.type = type;
  }

  public String getName() {
    return this.color + " " + this.type;
  }

  public Boolean needsWater() {
    return this.currentWaterAmount < this.optimalWaterAmount;
  }

  public void water(float amount) {
    this.currentWaterAmount += amount * absorb/100;
//    System.out.println(getName() + " water level: " + String.valueOf(currentWaterAmount));
  }

}
