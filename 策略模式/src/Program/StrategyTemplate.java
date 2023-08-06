package Program;

/**
 *
 * 策略模式模板
 *
 * 通过一个抽象父类，定义算法接口 接下来的三个子类 StrategyA StrategyB StrategyC  都是具体子类，实现抽象算法接口方法
 *
 *
 */

public abstract class StrategyTemplate {
    public abstract void AlgorithmInterface();  //算法接口
}

class ConcreteStrategyA extends StrategyTemplate{
    @Override
    public void AlgorithmInterface()
    {
        System.out.println("算法A");
    }
}

class ConcreteStrategyB extends StrategyTemplate{
    @Override
    public void AlgorithmInterface()
    {
        System.out.println("算法B");
    }
}

class ConcreteStrategyC extends StrategyTemplate{
    @Override
    public void AlgorithmInterface()
    {
        System.out.println("算法C");
    }
}

/**
 * 具体操作类 用一个具体策略来配置， 维护 一个对 Strategy对象的引用
 *
 */

class Context
{
    private StrategyTemplate strategy = null;

    public Context(StrategyTemplate strategy) {    //初始化时，传入具体的策略对象
        this.strategy = strategy;
    }

    public void ContextInterface()  //根据具体的策略对象，调用其算法的方法
    {
        strategy.AlgorithmInterface();
    }
}


