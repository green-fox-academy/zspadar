/**
 * Created by zsuzsanna.padar on 2017. 04. 17..
 */
public class Bird extends Animal {
  public Bird(String name, String gender, int age, int legNumber) {
    super(name, gender, age, legNumber);
  }

  public Bird(String name) {
    super(name);
  }



  public String wantChild() {
    return "Wants a child from an egg";
  }
}
