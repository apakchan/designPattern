package template;

/**
 * 桥接模式，使抽象部分和实现部分分离，使他们独立变化。
 *
 * 减少耦合，少用继承，继承是强耦合，父类改变子类一定改变。
 */

public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.run();

        ab.setImplementor(new ConcreteImplementorB());

        ab.run();
    }
}
