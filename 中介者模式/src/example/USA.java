package example;

public class USA extends Country{
    public USA(UnitedStates unitedStates) {
        super(unitedStates);
    }

    @Override
    void declare(String msg) {
        this.unitedStates.declared(msg,this);
    }

    @Override
    void getMessage(String msg) {
        System.out.println("美国收到了消息 : " + msg);
    }
}
