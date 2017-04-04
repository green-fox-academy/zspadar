/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Sponsor extends Person {
  private  String company;
  private int hiredStudents;

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a" + this.getAge() + " year old" + this.getGender() + "," +
            "who represents " + company + " and hired " + hiredStudents + " so far.");
  }

  public void hire(int numberOfStudents) {
    this.hiredStudents += 1;
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  Sponsor() {
    super();
    company = "Google";
    this.hiredStudents = 0;
  }

}
