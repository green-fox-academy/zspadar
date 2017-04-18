package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public abstract class StringInstrument extends Instrument {
  protected int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

  public StringInstrument() {
  }

  public StringInstrument(int number) {
    this.numberOfStrings = number;
  }

  public StringInstrument(String name) {
    super(name);
  }

}
