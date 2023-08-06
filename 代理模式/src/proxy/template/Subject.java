package proxy.template;

/**@author 陈柏宇
 * Subject类，定义了 RealSubject 和 Proxy(代理) 的共用接口，这样就在任何使用RealSubject
 * 的地方都可以使用Proxy(代理)
 * 这个类里面的方法也就是 RealSubject 希望 Proxy(代理) 代理的方法
 */

public abstract class Subject {
    /**
      * 抽象方法,RealSubject 希望 Proxy(代理) 代理的方法
     */
    public abstract void request();

}
