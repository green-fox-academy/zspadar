/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class Animals {
  public static void main(String[] args) {
    Animal giraffe = new Animal();
    Animal elephant = new Animal();

    System.out.println(giraffe.thirst);
    giraffe.play();
    System.out.println(giraffe.thirst);
    System.out.println(giraffe.hunger);
    System.out.println(elephant.thirst + elephant.hunger);
    elephant.drink();
    System.out.println(elephant.thirst);
    giraffe.eat();
    System.out.println(giraffe.hunger);
  }
}
