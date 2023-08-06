package example;

public class Client {
    public static void main(String[] args) {
        UnitedStates unitedStates = new UnitedNationsSecurityCouncil();
        Country USA = new USA(unitedStates);
        Country Mexico = new Mexico(unitedStates);

        unitedStates.setCountry1(USA);
        unitedStates.setCountry2(Mexico);

        USA.declare("墨西哥人滚出美国！");
        Mexico.declare("白皮猪wcnm!");
    }
}
