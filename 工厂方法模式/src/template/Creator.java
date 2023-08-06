package template;

/**
 * @author 陈柏宇
 * 工厂类，用来生产产品
 * 这里可以用抽象工厂父类也可以用接口，都可以，我这里就用抽象父类了
 */

public abstract class Creator {
    /**
     * 生产产品的抽象方法
     */
    public abstract Product factoryMethod();
}

/**
 * 下面就是具体的工厂，生产具体的产品
 */

class ConcreteCreator1 extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

class ConcreteCreator2 extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}

class ConcreteCreator3 extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
