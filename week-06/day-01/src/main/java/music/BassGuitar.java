package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class BassGuitar extends StringInstrument {
  public BassGuitar() {
    this.name = "BassGuitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay);
  }
}
