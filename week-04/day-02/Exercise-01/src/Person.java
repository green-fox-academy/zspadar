/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Person {
  private String name;
  private int age;
  private String gender;

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a" + age + " year old" + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Luve for the moment!");
  }

  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  Person(String name, int age, String gender) {
    this.name =  name;
    this.age = age;
    this.gender = gender;
  }
}
