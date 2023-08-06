package program1;

/**
 *
 * 简单工厂模式，生产出操作符
 *
 * 用的是静态方法 这样就不用造对象了
 */

public class OperationFactory {
    public static Operation createOperation(String operator)
    {
        Operation oper = null;

        switch(operator)
        {
            case "+": oper = new OperationAdd(); break;
            case "-": oper = new OperationSub(); break;
            case "*": oper = new OperationMul(); break;
            case "/": oper = new OperationDiv(); break;
        }
        return oper;
    }
}
