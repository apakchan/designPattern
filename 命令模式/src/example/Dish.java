package example;

public abstract class Dish {
    protected Cooker cooker;

    public Dish(Cooker cooker){
        this.cooker = cooker;
    }

    public abstract void execute();
}
