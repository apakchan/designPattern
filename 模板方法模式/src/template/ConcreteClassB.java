package template;

/**
 * @author 陈柏宇
 * 具体子类B
 */

public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperation1()
    {
        System.out.println("具体子类B方法1的实现");
    }
    @Override
    public void primitiveOperation2()
    {
        System.out.println("具体子类B方法2的实现");
    }
}
