import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by zsuzsanna.padar on 2017. 04. 21..
 */
public class Task  {
  private String name;
  private String status;
  private static final AtomicInteger count = new AtomicInteger(1);
  private int id;

  public Task(String name) {
    this.name = name;
    status = "incomplete";
  }


  public Task(String name, String status) {
    this.name = name;
    this.status = status;
    this.id = count.incrementAndGet();
  }


  public void setTaskDone() {

    status = "done";
  }

  public Boolean isDone() {

    return status.equals("done");
  }


  public String getName() {

    return name;
  }

  public String getStatus() {

    return status;
  }

  public int getId() {
    return id;
  }

  public String getDescription() {
    String statusMark = status.equals("done") ? "[x]" : "[ ]";
    return id + statusMark + " " + name;
  }

}
