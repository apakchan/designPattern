package decoration;

/**
 * @author cby
 * 学习设计模式要善于变通，如果只有一个ConcreteComponent类而没有抽象的Component类
 * 那么Decorator就可以是ConcreteComponent的一个子类。
 * 同样道理，如果只有一个ConcreteDecorator类，那就没有必要建立一个单独的Decorator类
 * 而可以把Decorator和ConcreteDecorator的责任合并成一个类
 *
 *
 */

class Person
{
    private String name;
    public Person()
    {}
    public Person(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("人类高质量" + this.name);
    }
}

public class DecorationExample extends Person
{
    protected Person component;

    public void Decorate(Person component)
    {
        this.component = component;
    }

    @Override
    public void show()
    {
        if(component != null)
        {
            component.show();
        }
    }
}
class Suit extends DecorationExample
{
    @Override
    public void show() {
        System.out.print("西装  ");
        super.show();
    }
}

class Tie extends DecorationExample
{
    @Override
    public void show() {
        System.out.print("领带  ");
        super.show();
    }
}

class LeatherShoes extends  DecorationExample{
    @Override
    public void show() {
        System.out.print("皮鞋  ");
        super.show();
    }
}

class Trouser extends  DecorationExample{
    @Override
    public void show() {
        System.out.print("西裤  ");
        super.show();
    }
}
