package template;

/**
 * @author 陈柏宇
 * 中介者模式：中介者使各对象不用显示引用，降低耦合度，，而且可以独立地改变他们的交互。
 *
 * 中介者模式很容易在系统中运用，也很容易在系统中误用，当系统中出现了多对多的情况时，不要急于运用中介者模式，
 * 先考虑自己的设计有没有问题。
 */

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague c1 = new ConcreteColleague1(mediator);
        Colleague c2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        c1.send("你好");
        c2.send("再见");
    }
}
