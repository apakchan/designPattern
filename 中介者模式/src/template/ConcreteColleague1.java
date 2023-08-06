package template;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    public void send(String msg){
        this.mediator.send(msg,this);
    }
    public void doNotify(String msg){
        System.out.println("同事一获得消息 : " + msg);
    }
}
