package template;

/**
 * @author 陈柏宇
 * 原型模式
 * 介绍 ： 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *
 * 举个例子，我们定义了一个类，类里面有具体的信息
 * 如果客户端有新建 20 个相同对象的需求，那么我们岂不是要实例化 20 个对象
 * 而且如果一个对象原型的数据出现了差错，那我们岂不是还要修该刚刚实例化的20个对象
 * 这样效率是不是太低了一点
 *
 * 于是在这个基础上提出了 原型模式 (Prototype)
 * 原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不用知道任何创建的细节
 */

public class Prototype implements Cloneable{
    private String id ;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /*
        clone() : Cloneable接口中的方法 创建一个新的对象，然后将当前对象的非静态字段复制到新对象
        如果字段是值类型的，则对该字段执行逐位赋值。如果字段是引用类型的，则复制引用而不复制引用的对象
        因此，原始对象及其副本引用同一对象,所以要注意深浅拷贝的问题，如果想实现深拷贝
        应该让引用也实现 Cloneable接口
     */
    @Override
    public  Prototype clone() throws CloneNotSupportedException
    {
        return (Prototype)super.clone();
    }

}

class ConcretePrototype extends Prototype
{
    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}







