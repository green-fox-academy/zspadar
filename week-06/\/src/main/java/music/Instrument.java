package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public  abstract class Instrument {
  protected String name;
  protected String sound;

  public Instrument(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  public Instrument() {

  }

  public abstract void play() ;
}
