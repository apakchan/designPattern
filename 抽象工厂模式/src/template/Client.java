package template;

/**
 * @author 陈柏宇
 * 抽象工厂模式，通过IFactory接口可以充分利用多态，当我们想要改变工厂的时候只要改变创建的实例即可
 *
 * 但是这样还是有点麻烦  未完待续......
 */

public class Client {
    public static void main(String[] args) {
        IFactory iFactory1 = new ConcreteFactory1();
        iFactory1.createProductA();
        iFactory1.createProductB();

        IFactory iFactory2 = new ConcreteFactory2();
        iFactory2.createProductA();
        iFactory2.createProductB();
    }
}
