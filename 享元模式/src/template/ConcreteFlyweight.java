package template;

public class ConcreteFlyweight extends Flyweight{
    @Override
    public void Operation(int extrinsicState) {
        System.out.println("具体享元" + extrinsicState);
    }
}
