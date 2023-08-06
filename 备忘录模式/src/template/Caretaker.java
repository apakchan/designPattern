package template;

/**
 * @author 陈柏宇
 * 管理员类，可以得到和设置当前的备忘录状态
 */

public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento)
    {
        this.memento = memento;
    }

    public Memento getMemento()
    {
        return this.memento;
    }
}
