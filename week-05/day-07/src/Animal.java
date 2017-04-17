/**
 * Created by zsuzsanna.padar on 2017. 04. 17..
 */
public abstract class Animal {
  private String name;
  private String gender;
  private int age;
  private int legNumber;

  public Animal(String name, String gender, int age, int legNumber) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.legNumber = legNumber;
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  public int getLegNumber() {
    return legNumber;
  }
  public  abstract String wantChild();



}
