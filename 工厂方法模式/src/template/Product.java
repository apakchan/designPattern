package template;

/**
 * @author  陈柏宇
 * 工厂方法模式生产的抽象产品父类以及它的具体产品子类
 * 这里我们应该灵活一点，可以不用类，也可以用接口啥的
 */

public abstract class Product {

    /*
        产品参数
     */
    private int arguments;

    /*
        产品的具体功能
     */
    public abstract void operation();
}

class ConcreteProduct1 extends Product
{
    @Override
    public void operation() {
        System.out.println("产品1的具体功能");
    }
}

class ConcreteProduct2 extends Product
{
    @Override
    public void operation() {
        System.out.println("产品2的具体功能");
    }
}

class ConcreteProduct3 extends Product
{
    @Override
    public void operation() {
        System.out.println("产品3的具体功能");
    }
}
