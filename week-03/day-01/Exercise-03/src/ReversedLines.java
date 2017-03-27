import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("reversed-lines.txt");
      List<String> lines = Files.readAllLines(path);
     // System.out.println(reverse(lines));
    }catch (IOException ex) {
      System.out.println("Unable to read!");
    }
    System.out.println("Readable!");
  }
}
