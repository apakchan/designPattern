package template;

/**
 * @author 陈柏宇
 * 适配器
 */

public class Adapter extends Target{

    //建立一个私有的被适配的对象
    private Adaptee adaptee = new Adaptee();

    /*
    这样就可以实现表面上调用request()方法变成实际调用SpecificRequest()方法
     */
    @Override
    void Request() {
        adaptee.specificRequest();
    }
}
