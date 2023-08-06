package example;

public class Client {
    public static void main(String[] args) {
        Person american = new American();

        Person chinese = new Translator();

        american.talk();

        chinese.talk();
    }
}
