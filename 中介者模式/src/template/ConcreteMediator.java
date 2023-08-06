package template;

public class ConcreteMediator extends Mediator{

    @Override
    void send(String msg, Colleague colleague) {
        if(colleague == colleague1){
            colleague2.doNotify(msg);
        }
        else{
            colleague1.doNotify(msg);
        }
    }
}
