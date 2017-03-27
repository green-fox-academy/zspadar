import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class Doubled {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("duplicated_chars.txt");
      List<String> lines = Files.readAllLines(path);
      System.out.println(remove(lines));
    } catch (IOException ex) {
      System.out.println("Unable to read");
    }
  }

  public static String remove (List<String> lines) {
    String nonDuplicated = new String();
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j+=2) {
          nonDuplicated = nonDuplicated + lines.get(i).charAt(j);
        }
        nonDuplicated = nonDuplicated + "\n";
    }return nonDuplicated;

  }
}

