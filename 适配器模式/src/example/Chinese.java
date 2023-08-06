package example;

/**
 * @author 陈柏宇
 * 中国人类
 */

public class Chinese extends Person {

    public Chinese()
    {
        this.nation = "中国";
    }

    @Override
    void talk() {
        System.out.println("吃了吗，老乡？");
    }
}
