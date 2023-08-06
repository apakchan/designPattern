package proxy.template;

/**
 * @author 陈柏宇
 * 真实实体 真正意愿的实体
 */

public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("真实实体的请求");
    }
}
