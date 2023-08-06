package decoration;

/**@author cby
 * 装饰模式模板
 * 装饰模式：
 * 动态地给一个对象添加一些额外的职责，就增强功能来说，装饰模式比生成子类更为灵活
 *
 * 总结：一个非常巧妙的设计模式，正如它的名字：装饰模式
 * 我们在穿一件衣服的时候是会按照一种顺序来穿的，先穿内裤再穿外裤
 * 如果反着来的话就不对了（超人除外）
 * 而这种设计模式正体现了这种要求有顺序的方法
 *
 * 几个细节：
 *  我们为什么可以确保顺序呢，因为在ConcreteDecorator的operation方法里面我们调用的
 * 是父类的operation方法，然后再调用自己的独特的方法。
 * Decorator类中的setComponent方法是用来设置传入的真正对象的，用来在operation中调用
 * 比如说这里 我们调用的是d2的operation方法,d2再去调用父类的operation方法，而父类中传入的
 * 是d1对象，所以调用的是d1的operation方法，d1再去调用父类的operation方法，而它的父类中
 * 传入的是ConcreteComponent的对象，所以调用的是ConcreteComponent对象的方法后再调用
 * d1本身的方法，再调用d2本身的方法
 * 所以我们在main函数中只调用了一个对象的operation方法，但是却出现了三行字，
 * 顺序和我们setComponent的顺序一致
 * 可以说是非常的巧妙了
 *
 *
 * 最后再总结一下
 * 装饰模式是为已有功能动态地添加更多功能的一种方式
 *
 * 在我们最初的设计中当系统需要新功能的时候，向旧的类中添加新的代码
 * 这些新的代码通常装饰了原有类的核心职责或者主要行为
 * 这种做法问题在于 他们在主类中加入了新的字段，新的方法，新的逻辑，从而增加了主类的复杂度
 * 而这些新加入的东西仅仅是为了满足一些只在某种特定情况下才会执行的特殊行为的需要
 * 而装饰模式提供了一种非常好的解决方案，它把每个要装饰的功能放在单独的类中，并让这个类包装
 * 它要装饰的对象，因此，当需要执行特殊行为时，客户代码就可以在运行时根据需要，有选择的
 * 按顺序的使用装饰功能包装对象了。
 *
 * 这个设计模式的优点总结下来就是把类中的装饰功能从类中搬移去除，这样可以简化原有的类
 *
 * 有效的把类的核心职责和装饰功能区分开了，而且可以去除相关类中重复的装饰逻辑
 */

/**定义了一个对象接口，可以动态添加职责
 *
 */
abstract class Component
{
    public abstract void operation();
}

class ConcreteComponent extends Component
{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}

public abstract class DecorationTemplate extends Component{
    protected Component component;

    /**
     * 设置component,体现了多态
     *
     */
    public void setComponent(Component component)
    {
        this.component = component;
    }

    /**
     * 重写了operation() 实际执行的是component的operation
     *
     */
    @Override
    public void operation() {
        if(component != null)
        {
            component.operation();
        }
    }
}
class ConcreteDecoratorA extends DecorationTemplate
{
    /**
     * 本类独有的功能，用于区别ConcreteDecoratorB
     */
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends DecorationTemplate
{
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior()
    {

    }
}
