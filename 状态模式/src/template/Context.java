package template;

/**
 * @author 陈柏宇
 * 定义当前状态的实例
 */

public class Context {
    private State state;

    public Context(State state)
    {
        /*
        定义Context的初始状态
         */
        this.state = state;
        System.out.println("初始状态为：" + state.getClass().getName());
    }

    /*
    可读写的状态属性，用于读取当前状态和设置新状态。
     */
    public void setState(State state)
    {
        this.state = state;
        System.out.println("当前状态:" + state.getClass().getName());
    }

    public State getState()
    {
        return this.state;
    }

    /*
    对请求做处理，并设置下一状态。
     */
    public void request()
    {
        state.handle(this);
    }
}
