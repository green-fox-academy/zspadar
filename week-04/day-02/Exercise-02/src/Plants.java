/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Plants {
  private String color;
  private int waterAmount;
  private int absorbation;

  Plants(String color, int waterAmount, int absorbation) {
    this.color = color;
    this.absorbation = absorbation;
    this.waterAmount = waterAmount;
  }

  public String getColor() {
    return color;
  }

  public int getWaterAmount() {
    return waterAmount;
  }
  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public int getAbsorbation() {
    return absorbation;
  }

  public void currentWaterAmount() {
    System.out.println(waterAmount);
  }

  public void currentAbsorbation() {
    System.out.println(absorbation);
  }



}
