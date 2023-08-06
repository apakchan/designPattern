package proxy.template;

/**
 * @author 陈柏宇
 * 代理者 代理真实实体的动作
 */

public class Proxy extends Subject{
    RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null)
        {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
