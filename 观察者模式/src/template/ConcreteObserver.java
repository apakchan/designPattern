package template;

/**
 * @author 陈柏宇
 * 具体观察者
 */

public class ConcreteObserver extends Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update()
    {
        observerState = subject.getSubjectState();
        System.out.println(this.name + "观察者的状态改变为:" + this.observerState);
    }

    //设置主题
    public ConcreteSubject getSubject()
    {
        return this.subject;
    }
    public void setSubject(ConcreteSubject concreteSubject)
    {
        this.subject = concreteSubject;
    }

}
