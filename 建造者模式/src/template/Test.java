package template;

/**
 * @author 陈柏宇
 * 建造者模式：
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 如果我们用了建造者模式，用户就只需指定需要的建造的类型就可以得到他们，而具体建造的过程和细节就不需要知道了
 */

public class Test {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Director.constructor(builder1);

        Product p1 = builder1.getResult();
        p1.show();

        Builder builder2 = new ConcreteBuilder1();
        Director.constructor(builder2);

        Product p2 = builder1.getResult();
        p2.show();
    }
}
