package template;

/**
 * 这里主要运用了多态的知识点
 * 对象的声明始终是其抽象父类，但是实例化是你要具体生产的Product
 *
 * 我们回过头来想一想之前学的简单工厂模式，这里的工厂方法模式其实和简单工厂模式很像
 * 只不过我们把循环判断改成了具体的工厂类
 * 这样给人的感觉反而麻烦了，问题也就出在这里，我们为什么要化简为繁呢？
 *
 * 这其实也就是工厂方法模式和简单工厂的区别所在。
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化
 * 相关的类，对于客户端来说，去除了与具体产品的依赖。
 * 但是它有一点问题，就是破坏了我们的封闭开放原则，因为如果我们要添加功能势必要增加一个分支，
 * 改变原有的类？这不是一个好方法。于是工厂方法就来了~
 */

public class FactoryTest {
    public static void main(String[] args) {

        Creator creator = new ConcreteCreator2();
        Product product = creator.factoryMethod();

        product.operation();

    }
}
