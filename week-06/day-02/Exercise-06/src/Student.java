import java.util.Comparator;

/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Student extends Person implements Comparator<Student> {
  private String previousOrganization;
  private int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " a " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganization
        + " who skipped " + skippedDays + " from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }


  private int getSkippedDays() {
    return skippedDays;
  }

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.getSkippedDays() == o2.getSkippedDays()) {
      return 0;
    }
    return o1.getSkippedDays() > o2.getSkippedDays() ? -1 : 1;
  }
}
