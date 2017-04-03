/**
 * Created by zsuzsanna.padar on 2017. 04. 02..
 */
public class PostItCreator {
  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.type = "ball";
    PostIt first = new PostIt("orange", "Idea 1", "blue", pen);
    PostIt second = new PostIt("pink", "Awesome!", "black", pen);
    PostIt third = new PostIt("yellow", "Superb!","green", pen);

    first.printPostIt();
    second.printPostIt();
    third.printPostIt();

  }
}
