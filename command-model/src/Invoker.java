/**
 * @author xiaosen
 * @date 2019/5/6 14:58
 * @description
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
