import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 03. 28..
 */
public class EncodedLines {
  public static void main(String[] args) {
    try{
      Path path = Paths.get("assets/encoded-lines.txt");
      List<String> lines = Files.readAllLines(path);
    } catch (IOException ex) {
      System.out.println("Error reading file! :((((");
    }
    System.out.println("File is perfectly readable, yeah!");
  }
}


