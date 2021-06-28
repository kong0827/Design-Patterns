/**
 * @author kxj
 * @date 2021/6/28 23:39
 * @desc
 */
public class Invoker {
    Command command;

    public void call() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
