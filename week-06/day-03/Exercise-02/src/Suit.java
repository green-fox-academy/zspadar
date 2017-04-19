import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public enum Suit {
  CLUBS(Color.BLACK), DIAMONDS(Color.RED), HEARTS(Color.RED), SPADES(Color.BLACK);


  private Color color;
  List<Suit> suits;
  public static final int  RANDOM = new Random;

  Suit(Color color) {

    this.color = color;
    this.suits = new ArrayList<>();

    for(int i = 0; i < suits.size(); i++) {
      suits.addAll(Arrays.asList(values()));
    }


    System.out.println(values());

  }








  public Color getColor() {
    return color;
  }

  public enum Color {
    BLACK, RED
  }
}
