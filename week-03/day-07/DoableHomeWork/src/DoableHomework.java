import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 02..
 */
public class DoableHomework {
  static List<String> type = new ArrayList<>();
  static List<String> leafColor = new ArrayList<>();
  static List<Integer> age = new ArrayList<>();
  static List<String> sex = new ArrayList<>();

  public static void main(String[] args) {
    treeMatchMaker("oak", "green", 222, "male");
    treeMatchMaker("palm", "yellowish broen", 24, "female");
    treeMatchMaker("cypress", "darkgreen", 325, "female");
    treeMatchMaker("sakoya", "red and green", 478, "male");
    treeMatchMaker("joshua", "pale green", 18, "female");

    printedTrees("oak");

  }

  public static void treeMatchMaker(String types, String leafColors, int ages, String sexes) {
    type.add(types);
    leafColor.add(leafColors);
    age.add(ages);
    sex.add(sexes);
  }

  public static void printedTrees(String details) {
    int i = type.indexOf(details);
    System.out.printf("Type: " + type.get(i) + "\n" + "Leaf Color: " + leafColor.get(i) + "\n" +
                      "Age: " + age.get(i) + "\n" + "Sex: " + sex.get(i));
  }
}
