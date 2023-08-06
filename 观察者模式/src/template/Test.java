package template;

/**
 * @author 陈柏宇
 * 观察者模式：
 * 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题在状态发生改变时，会通知所有观察者对象，让他们能够自动更新自己
 *
 * 观察者模式的动机：
 * 将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间的一致性。
 * 我们不希望为了维持一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。
 *
 * 观察者模式的关键对象是主题 Subject 和 观察者 Observer 一个Subject可以有多个Observer
 * 当Subject更新时所有的Observe都会收到通知并且更新。
 *
 * 使用时机：
 * 当一个对象的改变也需要改变其他对象时，而且它不知道具体有多少对象有待改变。
 * 当一个抽象模型有两个方面，一个方面依赖于另一个方面，使用这个模式可以将这两者封装在独立的对象中使他们各自独立地改变和复用
 *
 * 总结：
 * 这个模式的工作其实就是在解耦，让耦合的双方都依赖抽象，而不是具体，从而使各自的变化都不会影响另一边的变化。
 */

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver(subject,"a"));
        subject.attach(new ConcreteObserver(subject,"b"));
        subject.attach(new ConcreteObserver(subject,"c"));

        subject.setSubjectState("XYZ");
        subject.Notify();
    }
}
