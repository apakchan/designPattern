package dependence_inversion_principle;

/**
 * @author : 陈柏宇
 *
 * 在介绍依赖倒转原则之前请容我举个例子
 * 现在市面上绝大部分的CPU都是因特尔，AMD等公司制作的
 * 差不多都属于垄断技术了
 * 一块小小的CPU为什么就那么难以制作呢？
 * 因为CPU和计算机主板交互非常简单，目前主流的是接口为针脚式、触点式等
 * 而CPU是严密包装好的，内部再复杂也不让外界知道，这样其他人就无法复制它的结构了
 * 总而言之
 * CPU只提供给外界一个  “接口”  这个“接口” 能够与所有的计算机主板相匹配
 * 而CPU内部又是严密封装好的，所以CPU就是一个非常优秀的产品
 *
 * 话题再回到我们的依赖倒转原则
 * 介绍：抽象不应该依赖细节，细节应该依赖抽象
 *
 * 这话比较绕口，说白了。就是要针对接口编程，不要对实现编程。
 *
 * 无论主板、CPU、内存、硬盘都是在针对接口设计，如果针对实现设计
 * 那么就要对应到具体的某个品牌的主板，就会出现换内存条需要把主板也换了的尴尬
 *
 * 依赖倒转原则：
 * ① 高层模板不应该依赖低层模板。两个都应该依赖抽象
 * ② 抽象不应该依赖细节。细节应该依赖抽象。
 *
 * 那么为什么叫倒转呢？
 * 面向过程开发的时候，为了让常用代码可以复用，一般都会把这些常用代码写成许多函数的程序库
 * 这样我们在做新项目的时候去调用这些底层的函数就可以。这叫高层模块依赖低层模块。
 * 我们之前就常常这么做。
 *
 * 问题也就处在这里，我们要做新项目的时候，发现业务逻辑的高层模块都是一样的，但客户却希望
 * 使用不同的数据库或者存储信息方式，这时候就麻烦了。我们希望能再次利用这些高层模板，但是
 * 高层模板都和低层的访问数据库绑定在了一起，没办法复用，这就很糟糕了。
 * 好比PC 里面 主板坏了 这些CPU 内存条 硬盘都没用了，这显然不合理。
 * 反过来 内存条坏了也不应该影响其他部件的功能。
 * 而如果不论是高层模块还是低层模块都依赖与抽象。具体一点就是接口和抽象类
 * 只要接口稳定，那么任何一个更改都不需要担心其他受到的影响，这就是的无论高层模块还是低层模块都可以很容易被复用
 *
 * 那么为什么依赖了抽象的接口或者抽象类就不怕更改呢？
 * 接下来再让我介绍一个原则：里氏代换原则。
 *
 * ******************************我是分隔符***************************************
 *
 * 里氏代换原则
 *
 * 白话翻译： 一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且他无法察觉
 * 父类对象和子类对象的区别。也就是说，在软件里面，把父类都替换成它的子类，程序的行为没有变化。
 *      话说这很像多态诶......（小声BB）
 *
 * 简而言之 ： 子类型必须能够替换掉它们的父类型。
 *
 * 只有当子类可以替换掉父类，软件单位的功能不收到影响时，父类才可以真正被复用,而子类也可以在
 * 父类的基础上添加新的功能。
 *
 * 再举个例子 ： 动物类 方法有抽象方法eat() run() drink() shout()
 * 那么就可以写它的子类 猫狗牛羊类 ， 在子类里面重写这些抽象方法
 *
 * 而由于有里氏代换原则才让开放封闭成为可能
 *
 * 正是由于子类型的可替换性才使得使用父类类型的模块在无需修改的情况下就可以扩展
 *
 * 回过头来再看依赖倒转原则，高层模块不应该依赖低层模块，两个都应该依赖抽象。
 *
 * 总结：依赖倒转原则可以说是面向对象设计的标志，用哪种语言来编写程序不重要
 * 如果编写时考虑的都是如何针对抽象编程而不是针对细节编程，
 * 也就是程序中所有的依赖关系都是终止与抽象类或者接口，那就是面向对象的设计，
 * 反之就是过程化的设计了。
 */

public class Dependence_Inversion_Principle {

}
