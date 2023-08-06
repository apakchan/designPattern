package template;

/**
 * @author 陈柏宇
 */

public class PrototypeTest {
    public static void main(String[] args) {

        ConcretePrototype p1 = new ConcretePrototype("195030103");  //第一份对象创建(原型对象)
        ConcretePrototype p2 = null;  //第二份对象（复制的第一份对象）

        try
        {
            p2 = (ConcretePrototype) p1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println(p1.getId() == p2.getId());  //两个对象的唯一标识符 id是否相同

        System.out.println(p1 == p2);  //两个引用指向的地址是否相同

    }
}
