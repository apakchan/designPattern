package template;

public class Invoke {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        this.command.excute();
    }
}
