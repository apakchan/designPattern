package template;

/**
 * @author 陈柏宇
 * 抽象工厂类
 * 生产产品类
 */

public abstract class IFactory {
    public abstract IProductA createProductA();
    public abstract IProductB createProductB();
}

class ConcreteFactory1 extends IFactory{
    @Override
    public IProductA createProductA() {
        System.out.println("生产ProductA1");
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        System.out.println("生产ProductB1");
        return new ProductB1();
    }
}

class ConcreteFactory2 extends IFactory{
    @Override
    public IProductA createProductA() {
        System.out.println("生产ProductA2");
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        System.out.println("生产ProductB2");
        return new ProductB2();
    }
}

