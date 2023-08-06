package template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈柏宇
 * 主题通知者，每个主题都可以有任何数量的观察者
 */

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();
    //增加观察者
    public void attach(Observer observer)
    {
        this.observers.add(observer);
    }
    //删除某个观察者
    public void detach(Observer observer)
    {
        this.observers.remove(observer);
    }
    //通知
    public void Notify()
    {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
