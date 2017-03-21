/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise06 {
  public static void main(String[] args){
    int codingHours = 6;
    int workingDays = 5;
    int weeklyHours = 52;
    int semester = 17;
    System.out.println("Hours spent with coding ina semester: " +  semester * workingDays * codingHours);
    System.out.println("Percentage of the coding hours: " + semester * workingDays * codingHours / weeklyHours);

  }

}
