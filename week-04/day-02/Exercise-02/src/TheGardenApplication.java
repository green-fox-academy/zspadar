/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class TheGardenApplication {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));

    garden.status();

    garden.water(40);
    garden.water(70);
  }
}
