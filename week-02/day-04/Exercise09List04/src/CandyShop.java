/**
 * Created by zsuzsanna.padar on 2017. 03. 23..
 */
import java.util.*;

public class CandyShop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    for (int i = 0; i < arrayList.size(); i ++ ) {
      if (arrayList.indexOf(2) == i) {
       arrayList.set(i, "Croissant");
      } else if (arrayList.indexOf(false) == i) {
         arrayList.set(i, "Ice Cream");
      }
    }
    System.out.println(arrayList);
  }
}
