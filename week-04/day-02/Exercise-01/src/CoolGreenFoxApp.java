/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class CoolGreenFoxApp {
  public static void main(String[] args) {
    Person myPerson = new Person();
    myPerson.introduce();

    Student myStudent = new Student ();
    myStudent.introduce();
    myStudent.skipDays(3);
    myStudent.introduce();


  }

}
