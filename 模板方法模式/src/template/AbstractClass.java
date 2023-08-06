package template;

/**
 * @author 陈柏宇
 * 模板，一切具体事物的父类
 */

public abstract class AbstractClass {
    /**
     * 类中的原始方法
     * 子类都一定要执行的但是都不同的方法
     */
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void TemplateMethod()
    {
        primitiveOperation1();
        primitiveOperation2();
    }
}

