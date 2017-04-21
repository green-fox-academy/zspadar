/**
 * Created by zsuzsanna.padar on 2017. 04. 21..
 */
public class ListCommand extends Command {

  ListCommand() {
    super("l", "Lists all the tasks");
  }

  @Override
  public String execute() {
    return "No todos for today! :)";
  }
}