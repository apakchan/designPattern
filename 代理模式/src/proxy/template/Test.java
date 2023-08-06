package proxy.template;

/**
 * @author 陈柏宇
 * 这个模式很容易理解，我就不多赘述了
 * 但是还是要多注意几点
 * 我们在代理类中声明的成员变量是真实实体
 * 发出的动作也是真实实体的动作，代理只是一个桥梁
 */

public class Test {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();
        proxy.request();

    }
}
