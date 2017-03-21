/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise11 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secondinHour = 3600;
    int hoursInaDay = 24;
    int secondsinDay = secondinHour * hoursInaDay;

    System.out.println("remaining seconds: " + (secondsinDay - (currentHours * secondinHour + currentMinutes * 60 + currentSeconds)));
  }
}

