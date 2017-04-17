/**
 * Created by zsuzsanna.padar on 2017. 04. 17..
 */
public class Reptile extends Animal {
  public Reptile(String name, String gender, int age, int legNumber) {
    super(name, gender, age, legNumber);
  }

  public Reptile(String name) {
    super(name);
  }

  public String wantChild() {
    return "Wants a child from an egg";
  }

}
