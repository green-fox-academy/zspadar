/**
 * Created by zsuzsanna.padar on 2017. 04. 02..
 */
public class PostIt {
   public String backgroundColor;
   public String text;
   public String textColor;
   public Pen pen;

   PostIt(String backgroundColor, String text, String textColor, Pen pen) {
      this.backgroundColor = backgroundColor;
      this.text = text;
      this.textColor = textColor;
      this.pen = pen;
   }

   public void printPostIt() {
     System.out.println(this.text);
   }

}

