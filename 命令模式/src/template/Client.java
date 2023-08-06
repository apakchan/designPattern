package template;

/**
 * @author 陈柏宇
 * 将一个请求封装封装成为一个对象从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作
 *
 * 命令模式的优点：
 * 1、容易设计一个命令队列
 * 2、在需要的情况下，可以较容易的将命令记入日志
 * 3、允许接收请求的一方决定是否要否决请求
 * 4、可以容易地实现对请求的撤销与重做，
 * 5、由于加进新的具体命令类不影响其他类，因此增加新的具体命令类很容易
 * 6、把请求一个操作的对象和知道怎么执行一个操作的对象分割开来。
 *
 * 根据敏捷开发原则，只有真正需要撤销、恢复功能时，把原来的代码重构为命令模式才有意义。
 *
 */

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoke invoke = new Invoke();

        invoke.setCommand(command);
        invoke.executeCommand();
    }
}
