package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Violin extends StringInstrument {
  public Violin() {
    this.name ="Violin";
    this.numberOfStrings = 4;
    this.sound="Schreech";
  }



  @Override
  public void play() {
    System.out.printf(formatForPlay,name, numberOfStrings, sound);
  }
}
