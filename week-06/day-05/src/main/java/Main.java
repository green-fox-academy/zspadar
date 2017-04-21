import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class Main {
  public static void main(String[] args) {

    TaskManager taskManager = new TaskManager();
    System.out.println(taskManager.runCommands(args));
  }

}
