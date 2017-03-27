import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("reversed-lines.txt");
      List<String> lines = Files.readAllLines(path);
      System.out.println(reverse(lines));
    }catch (IOException ex) {
      System.out.println("Unable to read!");
    }
    System.out.println("Readable!");
  }


  public static List<String> reverse (List<String> sentence){
    ArrayList<String> reversedSentence = new ArrayList<>();
    for (int i = sentence.size() - 1; i >= 0; i--) {
      reversedSentence.add(sentence.get(i));
    }
    return reversedSentence;
  }
}
