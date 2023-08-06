package example;

public class UnitedNationsSecurityCouncil extends UnitedStates{
    @Override
    public void declared(String msg, Country country) {
        if (country == country1){
            country2.getMessage(msg);
        }
        else{
            country1.getMessage(msg);
        }
    }
}
