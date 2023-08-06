package example;

public class Client {
    public static void main(String[] args) {

        BabySingleton baby = BabySingleton.getInstance();

        System.out.println(baby);

    }
}
