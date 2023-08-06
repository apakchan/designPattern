package example;

/**
 * @author 陈柏宇
 * 美国人类
 */

public class American extends Person{

    public American()
    {
        this.nation = "美国";
    }

    @Override
    void talk() {
        System.out.println("HowDay neighbour?");
    }
}
