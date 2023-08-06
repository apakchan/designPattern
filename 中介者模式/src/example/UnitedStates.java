package example;

public abstract class UnitedStates {
    protected Country country1;
    protected Country country2;

    public void setCountry1(Country country1) {
        this.country1 = country1;
    }

    public void setCountry2(Country country2) {
        this.country2 = country2;
    }

    public abstract void declared(String msg, Country country);

}
