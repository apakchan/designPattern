package template;

/**
 * 如果一个应用程序使用了大量的对象，而大量的对象造成了很大的存储开销，就应该考虑使用。
 * 或者对象的大多数状态是外部状态，若果删除对象的外部状态，那么可以使用相对较少的共享对象取代很多组对象，此时考虑使用享元。
 *
 * 比如说下棋，围棋只有黑白两色，而棋盘却有361个位置，如果new 361个旗子实例那么程序的开销太大了，所以我们只用创建两个对象
 * 实例，外部状态使用坐标，这样就可以大大减少开支了。
 */

public class Client {
    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.Operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.Operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.Operation(--extrinsicState);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.Operation(--extrinsicState);
    }
}
