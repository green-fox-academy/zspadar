import java.util.Comparator;

/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Mentor extends Person implements Comparator<Mentor> {

  private String level;

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + " a " + this.getAge() + " year old " + this.getGender() + " "
            + level + " mentor.");
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super();
    this.level = "intermediate";
  }

  private String getLevel() {
    return level;
  }

  @Override
  public int compare(Mentor mentor, Mentor mentor2) {
    if (mentor.getLevel().equals(mentor2.getLevel())) {
      return 0;
    }
    if (mentor.getLevel().equals("hardcore") || mentor.getLevel().equals("intermediate") && mentor2.getLevel()
        .equals("basic")) {
      return 1;
    } else {
      return -1;
    }
  }
}
