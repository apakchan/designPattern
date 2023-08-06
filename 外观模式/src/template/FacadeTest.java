package template;

/**
 * @author 陈柏宇
 *
 * 外观模式的使用场景：
 * 首先在设计初期阶段，应该要有意识的将不同的两个层分离，比如经典的三层架构MVC
 * 就要考虑在数据访问层和业务逻辑层，业务逻辑层和表示层的层与层之间建立外观Facade
 *
 * 其次，在开发阶段，子系统往往因为不断的重构演化而变得越来越复杂，大多数模式在使用的时候
 * 会产生很多很多的小类，这本来是一件好事，但是也给外部调用它们的用户带来了使用上的困难，
 * 增加外观Facade可以提供一个简单的接口，减少它们之间的依赖。
 *
 * 第三，在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了，但因为它包含了非常重要的内容，
 * 新的需求开发必须要依赖于它，此时使用外观模式Facade也是非常合适的，我们可以为一个新系统开发一个外观Facade类，
 * 来提供设计粗糙的或者高度复杂的遗留代码的比较清晰的简单的接口，让新系统与Facade对象交互，Facade与遗留代码交互。
 */

public class FacadeTest {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.methodA();
        f.methodB();
    }
}
