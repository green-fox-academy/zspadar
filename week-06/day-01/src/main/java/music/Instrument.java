package main.java.music;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public  abstract class Instrument {
  protected String name;

  public Instrument(String name) {
    this.name = name;
  }

  public abstract void play() ;
}
