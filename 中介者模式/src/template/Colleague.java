package template;

//抽象同事类
public abstract class Colleague {
    //中介者
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    abstract void doNotify(String msg);
    abstract void send(String msg);
}
