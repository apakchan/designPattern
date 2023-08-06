package templates;

public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){
        //其他的相关方法
    }
}
