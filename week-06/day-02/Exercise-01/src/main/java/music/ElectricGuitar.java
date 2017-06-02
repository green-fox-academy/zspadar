package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
public class ElectricGuitar extends StringedInstrument {
  private String formatElectricGuitarForPlay = "twangs";

  public ElectricGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
    super.name = "ElectricGuitar";
    this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
  }

  public ElectricGuitar() {
    super.name = "ElectricGuitar";
    super.numberOfStrings = 6;
    this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
  }

  @Override
  public void play() {
    System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + formatElectricGuitarForPlay + "\n");
  }
}