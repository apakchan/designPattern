package example;

public class Mexico extends Country{
    public Mexico(UnitedStates unitedStates) {
        super(unitedStates);
    }

    @Override
    void declare(String msg) {
        this.unitedStates.declared(msg,this);
    }

    @Override
    void getMessage(String msg) {
        System.out.println("墨西哥收到了消息 : " + msg);
    }
}
