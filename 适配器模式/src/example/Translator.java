package example;

/**
 * @author 陈柏宇
 * 翻译，也就是适配器
 */

public class Translator extends Person{
    Chinese chinese = new Chinese();

    @Override
    void talk() {
        System.out.print("中国人说 : ");
        chinese.talk();
        System.out.print("被翻译为 : ");
        System.out.println("Have you eaten today , neighbour?");
    }
}
