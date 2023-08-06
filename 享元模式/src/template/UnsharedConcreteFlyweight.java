package template;

public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void Operation(int extrinsicState) {
        System.out.println("不共享的具体享元" + extrinsicState);
    }
}
