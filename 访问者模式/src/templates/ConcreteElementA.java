package templates;

public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
       visitor.visitConcreteElementA(this);
    }

    public void operationA(){
        //其他的相关方法
    }
}
