package example;

public abstract class Country {
    protected UnitedStates unitedStates;

    public Country(UnitedStates unitedStates) {
        this.unitedStates = unitedStates;
    }

    abstract void declare(String msg);

    abstract void getMessage(String msg);
}
