import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 21..
 */
public class TaskManager {
  private ArrayList<Task> taskList;
  private CSVHelper dataManager;
  List<Command> commands;

  public TaskManager() {
    commands = new ArrayList<>();
    commands.add(new RemoveCommand());
    commands.add(new ListCommand());
    commands.add(new AddCommand());
    commands.add(new CompleteCommand());
    taskList = new ArrayList<>();
    dataManager = new CSVHelper("data.csv");
    load();
  }

  private void save() {

    dataManager.save(taskList);
  }

  private void load() {

    taskList = dataManager.load();
  }

  public String printUsage() {
    String help = "\n" +
            "Java ToDo Application" + "\n" +
            "=====================" + "\n" +
            "\n" +
            "Command line arguments: " + "\n";
    for (Command command: commands) {
      help+= command.getUsage() + "\n";
    }
    return help;
  }

  public String runCommands(String[] args) {
    if (args.length == 0) {
      return printUsage();
    } else if (args[0].equals("-l")) {
      printList();
    } else if (args[0].equals("-a")) {
      addTask( String.join(" ", Arrays.copyOfRange(args, 1, args.length)) );
    } else if (args[0].equals("-r")){
      removeTask(Integer.parseInt(args[1]));
    } else if (args[0].equals("-c")) {
      completeTask(Integer.parseInt(args[1]));
    } else {
      System.out.println("Unsupported argument");
    }
    return "";
  }



  public void addTask(String name) {
    taskList.add(new Task(name));
    save();
  }

  public void removeTask(int index) {
    if (taskList.size() >= 2) {
      taskList.remove(index - 1);
      save();
    }
  }

  public void completeTask(int index) {
    taskList.get(index - 1).setTaskDone();
    save();
  }

  public void printList() {
    if (taskList.size() == 0) {
      System.out.println("No todos today");
    }
    for(int i=0; i<taskList.size(); i++) {
      System.out.println(String.valueOf(i + 1) + " " + taskList.get(i).getDescription());
    }
  }

}
