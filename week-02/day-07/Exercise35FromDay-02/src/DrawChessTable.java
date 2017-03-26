import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on 2017. 03. 26..
 */
public class DrawChessTable {
  public static void main(String[] args) {

    for (int i = 0; i < 8; i++) {
      System.out.println();
      for (int j = 0; j < 8; j++) {
        if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}

