package template;

/**
 * @author 陈柏宇
 * 适配器模式的使用场景：
 * 想使用一个已经存在的类，但如果它的接口，也就是它的方法和你的要求不相同时，就应该考虑使用适配器模式。
 * 两个类所做的事情相同或相似，但是具有不同的接口要使用它。
 * 这样，客户代码就可以统一的调用统一接口就行了，这样更简单，更紧凑，更直接。
 *
 * 适配器模式不要乱用，要在双方都不太容易修改的时候使用。
 *
 */

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();

        target.Request();  //对客户端来说,调用的就是request方法

    }
}
