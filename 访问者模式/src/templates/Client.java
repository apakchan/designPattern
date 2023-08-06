package templates;

/**
 * 访问者模式：
 * 适用于数据结构相对稳定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作结合可以相对自由地演化。
 * 访问者模式目的是把处理从数据结构中分离出来。如果有比较稳定的数据结构和易于变化的算法的话，使用访问者模式就是比较适合的。
 * 因为访问者模式使得算法操作的增加变得更加容易。
 * 其实访问者模式的优点就是增加新的操作很容易，因为增加新的操作就意味着增加一个新的访问者，访问者模式将有关的行为集中
 * 到一个访问者对象中去。
 */

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        os.add(new ConcreteElementB());
        os.add(new ConcreteElementA());

        os.accept(new ConcreteVisitorA());
        os.accept(new ConcreteVisitorB());
    }
}
