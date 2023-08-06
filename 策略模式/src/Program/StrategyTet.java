package Program;

/**
 * 总结：
 * 策略模式和简单工厂模式是很相似的，对于抽象父类和具体子类那里和简单工厂是一回事
 * 不过下面还多添加了一个Context类，用来调用算法接口
 * 来说说简单工厂和策略模式的区别：
 * 简单工厂是生产对象来调用对象的方法，在主函数中用简单工厂生产对象调用方法
 * 而策略模式是在Context类中生产对象，然后在Context类中调用Context中的对象的方法，在主函数中创建Context类的对象调用方法
 *
 *
 * 总而言之 策略模式是一种定义了一系列算法的方法，（多态真是绝绝子,yyds，正是多态才完美的实现了继承的功能 真正做到了降低代码的冗余）
 * 从context类来看我们只是创建了一个抽象父类，调用了这个抽象父类中的抽象方法，而switch去实例化它的子类，编译是看的是父类
 * 运行时，真正调用的其实是子类的方法，这就是多态。
 * 如果我们想多添加功能只需要添加对应的子类，重写方法，然后再context类中多添加一个case分支，就可以了，不需要对我们的代码进行“大手术”
 *
 */

public class StrategyTet {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常收费");
        System.out.println("1000元正常收费："+cashContext.GetResult(1000));

        cashContext = new CashContext("打八折");
        System.out.println("1000元打八折："+cashContext.GetResult(1000));

        cashContext = new CashContext("满300返100");
        System.out.println("1000元满三百减一百："+cashContext.GetResult(1000));


    }
}
