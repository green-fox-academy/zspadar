/**
 * Created by zsuzsanna.padar on 2017. 04. 21..
 */
public abstract  class Command {
  private String flag;
  private String usageDescription;

  Command(String flag, String usageDescription) {
    this.flag = flag;
    this.usageDescription = usageDescription;
  }
  public abstract String execute();

  public String getFlag() {
    return flag;
  }

  public String getUsage() {
    return " -" + flag + "   " + usageDescription;
  }

}
