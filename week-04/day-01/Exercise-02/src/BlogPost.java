/**
 * Created by zsuzsanna.padar on 2017. 04. 03..
 */
public class BlogPost {
  public String authorName;
  public String title;
  public String text;
  public String publicationDate;

  BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
  public void printBlogPost() {
    System.out.println(this.text);
  }

}
