package template;

/**
 * @author 陈柏宇
 * 这个模式适合功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分时
 * Originator类可以根据保存的Memento信息还原到前一状态
 *
 * 如果在某个系统中使用命令模式，需要实现命令模式的撤销功能，那么命令模式可以使用备忘录来存储可撤销操作的状态
 *
 */

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("状态良好！");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("没打过Boss,状态很差！");
        o.show();

        o.setMemento(c.getMemento());
        o.show();


    }
}
