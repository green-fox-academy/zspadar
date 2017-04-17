/**
 * Created by zsuzsanna.padar on 2017. 04. 17..
 */
public class Mammal extends Animal {
  public Mammal(String name, String gender, int age, int legNumber) {
    super(name, gender, age, legNumber);
  }

  public Mammal(String name) {
    super(name);
  }
  public String wantChild() {
    return "Wants a child from uterus";
  }
}
