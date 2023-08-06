package template;

/**
 * @author 陈柏宇
 * 备忘录，存储或者设置状态
 */

public class Memento {
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

}
