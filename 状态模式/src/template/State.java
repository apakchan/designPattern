package template;

/**
 * @author 陈柏宇
 */

public abstract class State {
    abstract void handle(Context context);
}

class ConcreteStateA extends  State{
    /*
    设置ConcreteStateA的下一状态是ConcreteStateB
     */
    @Override
    void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends  State{
    /*
    设置ConcreteStateB的下一状态是ConcreteStateA
     */
    @Override
    void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}