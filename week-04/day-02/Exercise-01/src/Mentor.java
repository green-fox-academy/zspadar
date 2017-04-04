/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Mentor extends Person {
  private String level;

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a" + this.getAge() + " year old" + this.getGender() + "," +
            level + "mentor.");
  }
}
