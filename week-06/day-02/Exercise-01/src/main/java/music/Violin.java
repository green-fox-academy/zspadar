package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 05. 31..
 */
public class Violin extends StringedInstrument {
  private String formatViolinForPlay = "screeches";

  public Violin() {
    this.formatViolinForPlay = formatViolinForPlay;
    super.name = "Violin";
    super.numberOfStrings = 4;
  }

  @Override
  public void play() {
    System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + formatViolinForPlay
        + "\n");
  }
}
