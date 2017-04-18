package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class ElectricGuitar extends StringInstrument {
  public ElectricGuitar() {
    this.numberOfStrings = 6;
    this.name = "ElectricGuitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay);
  }
}
