package decoration;

public class DecorationExampleTest {
    public static void main(String[] args) {

        Person cby = new Person("cby");

        LeatherShoes leatherShoes = new LeatherShoes();
        Trouser trouser = new Trouser();
        Tie tie = new Tie();
        Suit suit = new Suit();

        leatherShoes.Decorate(cby);
        trouser.Decorate(leatherShoes);
        tie.Decorate(trouser);
        suit.Decorate(tie);

        suit.show();

    }
}
