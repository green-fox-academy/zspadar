package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
public class BassGuitar extends StringedInstrument {
  private String formatBassGuitarForPlay = "Duum-duum-duum";

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
    super.name = "Bass Guitar";
    this.formatBassGuitarForPlay = formatBassGuitarForPlay;
  }

  public BassGuitar() {
    super.name = "Bass Guitar";
    super.numberOfStrings = 4;
    this.formatBassGuitarForPlay = formatBassGuitarForPlay;
  }

  @Override
  public void play() {
    System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " +
        formatBassGuitarForPlay + "\n");
  }

}
