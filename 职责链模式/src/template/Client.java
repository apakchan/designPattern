package template;

/**
 * 职责链模式 ：
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递请求，
 * 直到有一个对象处理请求为止。
 *
 * 职责链的好处：
 * 1、当客户提交一个请求时，请求是沿着链传递直到有一个ConcreteHandler对象负责处理它
 *   这使得接受者和发送者都没有对方的明确信息，都不知道对方是谁，结果是职责链简化了对象的连接，
 *   它们只需要保持一个指向其后继者的引用，而不需要保持它所有的候选接受者的引用。
 * 2、我们可以随时增加或修改处理一个请求的结构，增强的对象指派职责的灵活性。
 *
 * 很像链表结构。
 */

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        for(int i=0;i < 20;i++){
            int randNum = (int) (Math.random() * 40);
            h1.handleRequest(randNum);
        }
    }
}
