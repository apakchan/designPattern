package example;

public class Meet extends Dish{
    public Meet(Cooker cooker) {
        super(cooker);
    }

    @Override
    public void execute() {
        cooker.cookMeat();
    }
}
