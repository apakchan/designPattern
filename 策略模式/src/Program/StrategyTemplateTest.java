package Program;

/**
 *
 * 对策略模式模板类的测试
 *
 */

public class StrategyTemplateTest {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
