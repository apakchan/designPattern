package template;

/**
 * @author 陈柏宇
 * 指挥者类，负责组件的组装
 */

public class Director {
    public static void constructor(Builder builder)
    {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
