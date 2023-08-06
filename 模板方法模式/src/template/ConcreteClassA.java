package template;

/**
 * @author 陈柏宇
 * 具体子类，继承AbstractClass类并且实现父类中的抽象方法
 *
 */

public class ConcreteClassA extends AbstractClass{

    @Override
    public void primitiveOperation1()
    {
        System.out.println("具体子类A方法1的实现");
    }
    @Override
    public void primitiveOperation2()
    {
        System.out.println("具体子类A方法2的实现");
    }
}
