package template;

/**
 * @author 陈柏宇
 * 这个设计模式适合在这样的场景下使用:
 * 我们想输出一个相同问题的不同答案，那么这个时候只要答案不同就可以了，题目都是相同的
 * 所以我们就可以写一个父类，让这个父类在模板方法里写出题干，父类的抽象方法则是子类要去实现的功能
 *
 * 那么我们既然已经使用了继承，并且肯定这个继承有意义，父类就应该要成为子类的模板，所有重复的代码都应该
 * 上升到父类中去，而不是让每个子类都重复
 *
 * 我们再来介绍一下模板方法模式：
 * 定义一个操作中的算法的骨架，并且将一些步骤延迟到子类中去，模板方法让每个子类可以不改变一个算法的结构
 * 即可重新定义该算法的某些特定步骤
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.TemplateMethod();

        c= new ConcreteClassB();
        c.TemplateMethod();
    }
}
