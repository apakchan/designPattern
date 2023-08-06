package template;

/**
 * @author 陈柏宇
 * 外观模式：
 * 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用
 */

public class Facade {
    private SubSystem1 one;
    private SubSystem2 two;
    private SubSystem3 three;
    private SubSystem4 four;

    public Facade()
    {
        one = new SubSystem1();
        two = new SubSystem2();
        three = new SubSystem3();
        four = new SubSystem4();
    }

    public void methodA()
    {
        System.out.println("方法组A");
        one.Method1();
        two.Method2();
        four.Method4();
    }
    public void methodB()
    {
        System.out.println("方法组B");
        three.Method3();
    }
}
