package template;


//抽象中介者
public abstract class Mediator {
    protected Colleague colleague1;
    protected Colleague colleague2;
    public void setColleague1(Colleague colleague){
        this.colleague1 = colleague;
    }

    public void setColleague2(Colleague colleague){
        this.colleague2 = colleague;
    }
    abstract void send(String msg,Colleague colleague);

}
