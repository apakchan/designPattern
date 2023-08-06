package program1;

/**
 * 对程序的终极追求：可维护、可复用、可拓展、灵活性好
 * 编程有一原则：用尽可能的方法去避免重复
 *
 * 紧耦合 VS 松耦合
 */


public class ProgramTest {
    public static void main(String[] args) {

        Operation oper = OperationFactory.createOperation("+");  //体现了多态性，因为左边是Operation的引用，而右边是生产出了它的子类

        oper.set_numberA(1);
        oper.set_numberB(2);

        System.out.println(oper.GetResult());

    }
}
/**
 * 总结来说就是先写一个抽象的父类
 * 然后用具体的子类继承这个父类 重写父类中关键的抽象的方法
 * 利用简单工厂类去生产出具体的子类，简单工厂里面的方法是静态方法，可以通过类名调用
 * 在主函数中，用多态的方法，声明抽象父类的引用，去实例化简单工厂中的子类，然后这个对象就造好了，再进行操作即可。
 *
 */