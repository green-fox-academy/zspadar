/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Class {
  public static void main(String[] args) {
    Student student = new Student();
    Teacher teacher = new Teacher();

    System.out.println(teacher.teach(student));
    System.out.println(student.question(teacher));

  }
}
