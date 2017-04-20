package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class BassGuitar extends StringInstrument {
  public BassGuitar() {
    this.name = "BassGuitar";
    this.numberOfStrings = 4;
    this.sound ="Dum-dum-dumm";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay,name, numberOfStrings, sound);
  }
}
