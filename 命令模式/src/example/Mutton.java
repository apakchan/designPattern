package example;

public class Mutton extends Dish{
    public Mutton(Cooker cooker) {
        super(cooker);
    }

    @Override
    public void execute() {
        cooker.cookMutton();
    }
}
