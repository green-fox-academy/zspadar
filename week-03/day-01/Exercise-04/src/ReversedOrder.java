import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class ReversedOrder {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("assets/reversed-order.txt");
      List<String> lines = Files.readAllLines(path);
    } catch (IOException ex) {
      System.out.println("Reading error!");
    }
    System.out.println("Readable file! :)");
  }
}
