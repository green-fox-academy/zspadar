/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Plants {
  public int waterAmount;
  public double absorbation;

  Plants(int waterAmount, double absorbation) {
    this.absorbation = absorbation;
    this.waterAmount = waterAmount;
  }

  public void currentWaterAmount() {
    System.out.println(waterAmount);
  }

  public void currentAbsorbation() {
    System.out.println(absorbation);
  }
}
