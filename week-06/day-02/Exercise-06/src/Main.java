import java.util.ArrayList;

/**
 * Created by zsuzsanna.padar on 2017. 06. 01..
 */
public class Main {
  public static void main(String[] args) {
    ArrayList<Person> listOfPeople = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    listOfPeople.add(mark);
    Person jane = new Person("Jane", 29, "female");
    listOfPeople.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    listOfPeople.add(john);
    Student student = new Student("Bela Lugosi", 1115, "male", "Hollywood");
    listOfPeople.add(student);

    Mentor gandhi = new Mentor("Gandhi", 155, "male", "senior");
    listOfPeople.add(gandhi);
    Mentor mentor = new Mentor("Tojas", 30, "male", "supersenior");
    listOfPeople.add(mentor);
    Sponsor sponsor = new Sponsor("Barbara", 50, "female", "HRGod");
    listOfPeople.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "Tesla");
    listOfPeople.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : listOfPeople) {
      person.introduce();
      person.getGoal();
    }

    Lagopus sabers = new Lagopus("Sabers");
    sabers.addStudent("Béla");
    sabers.addStudent("John");
    sabers.addMentor("Test Mentor");
    sabers.addMentor("gandhi");
    sabers.info();

    john.skipDays(5);
    student.skipDays(3);
    System.out.println(student.compare(john, student));

    Mentor mentor1 = new Mentor("Gyuri", 25, "male", "semisenior");
    System.out.println(mentor.compare(mentor, mentor1));
  }

}