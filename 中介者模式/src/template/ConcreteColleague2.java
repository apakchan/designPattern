package template;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg){
        this.mediator.send(msg,this);
    }
    public void doNotify(String msg){
        System.out.println("同事二获得消息 : " + msg);
    }
}
