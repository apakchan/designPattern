package templates;

public class ConcreteVisitorB extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println(elementA.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println(elementB.getClass().getName() + "被" + this.getClass().getName() + "访问");
    }
}
