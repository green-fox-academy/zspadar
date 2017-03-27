
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class Lotto {
  public static void main(String[] args) {
    Path path = Paths.get("otos.csv");
    try {
      List<String> lines = Files.readAllLines(path);
    } catch (IOException ex){
        ArrayList<String> splittedList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
          splittedList.add(Arrays.asList(lines.get(i).split(";")));
          System.out.println(splittedList);
    }
    }
  }
}
