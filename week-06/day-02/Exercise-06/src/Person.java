/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Person {
  private String name;
  private int age;
  private String gender;

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public String getName() {
    return this.name;
  }

  public String getGender() {
    return this.gender;
  }

  public int getAge() {
    return this.age;
  }

}
