/**
 * Created by zsuzsanna.padar on 2017. 04. 17..
 */
public class Zoo {
  public static void main(String[] args) {
    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("Who wants a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild());
    System.out.println(mammal.getName() + ", " + mammal.wantChild());
    System.out.println(bird.getName() + ", " + bird.wantChild());
  }
}
