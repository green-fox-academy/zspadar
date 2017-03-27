import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zsuzsanna.padar on 2017. 03. 27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("reversed-lines.txt");
      List<String> lines = Files.readAllLines(path);
      mirroLines(lines);
    } catch (IOException ex) {
      System.out.println("Unable to read!");
    }
    System.out.println("Readable!");
  }

  public static void mirroLines (List<String> reflect) {
    for (int i = 0 ; i < reflect.size() ; i ++) {
      System.out.println(new StringBuilder(reflect.get(i)).reverse().toString());
    }
  }



  /*public static List<String> reverse (List<String> changeOrderinLines) {
    ArrayList <String> changeOrderInLines = new ArrayList<>();
    for (int i = changeOrderInLines.size() - 1; i <= changeOrderInLines.size(); i--) {
      changeOrderinLines.add(changeOrderInLines.get(i));
    }
    return changeOrderInLines;
  } */
}
