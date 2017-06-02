import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Lagopus {

  private String className;
  private List<String> students;
  private List<String> mentors;

  Lagopus(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(String student) {
    students.add(student);
  }

  public void addMentor(String mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(
        "Lagopus " + className + "class has " + students.size() + " students and " + mentors.size()
            + " mentors.");
  }

}
