/**
 * Created by zsuzsanna.padar on 2017. 04. 19..
 */
public enum Suit {
  CLUBS(Color.BLACK), DIAMONDS(Color.RED), HEARTS(Color.RED), SPADES(Color.BLACK);


  private Color color;

  Suit(Color color) {

    this.color = color;
    System.out.println(values());

  }



  public Color getColor() {
    return color;
  }

  public enum Color {
    BLACK, RED
  }
}
