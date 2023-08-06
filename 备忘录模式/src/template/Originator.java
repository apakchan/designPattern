package template;

/**
 * @author 陈柏宇
 * 发起人类，可以创建备忘录并保存，还可以恢复备忘录，显示当前状态
 */

public class Originator {
    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        System.out.println("调用备忘录恢复状态");
        this.state = memento.getState();
    }

    public void show()
    {
        System.out.println("状态为：" + this.state);
    }
}
