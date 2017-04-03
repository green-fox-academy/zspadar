public class SharpieMaker {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("yellow", 150f);
    Sharpie sharpie2 = new Sharpie("red", 30f);
    Sharpie sharpie3 = new Sharpie("black", 30f);

    SharpieSet sharpies= new SharpieSet();
    sharpies.addSharpies(sharpie1);
    sharpies.addSharpies(sharpie2);
    sharpies.addSharpies(sharpie3);

    sharpie1.use();
    sharpie1.use();
    sharpie2.use();
    sharpie2.use();

    System.out.println(sharpies.countUsable());


    for (int i = 0; i < sharpies.sharpies.size(); i++ ) {
      System.out.println(sharpies.sharpies.get(i).color);
    }

    sharpies.removeTrash();

    for (int i = 0; i < sharpies.sharpies.size(); i++ ) {
      System.out.print(sharpies.sharpies.get(i).color + " ");
    }
  }
}