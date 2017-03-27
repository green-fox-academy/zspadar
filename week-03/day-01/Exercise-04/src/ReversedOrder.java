import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class ReversedOrder {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("assets/reversed-order.txt");
      List<String> lines = Files.readAllLines(path);
      printReversedToLines(reversed(lines));
    } catch (IOException ex) {
      System.out.println("Reading error!");
    }
    System.out.println("Readable file! :)");
  }
  public static List<String> reversed (List<String> reversedSenteces) {
    ArrayList<String> reversedSentence = new ArrayList<>();
    for (int i = reversedSenteces.size() - 1; i >= 0; i--) {
      reversedSentence.add(reversedSenteces.get(i));
    }
    return reversedSentence;
  }
  public static void printReversedToLines (List<String> reversedList) {
    for (int i = 0; i < reversedList.size(); i++) {
      System.out.println(reversedList.get(i));
    }

  }
}
