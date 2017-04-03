/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger -= 1;
  }

  public void  drink() {
    thirst -= 1;
  }

  public void  play() {
    thirst += 1;
    hunger += 1;
  }

}

