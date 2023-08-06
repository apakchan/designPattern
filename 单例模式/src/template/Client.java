package template;

public class Client {
    public static void main(String[] args) {

        LazySingleton singleton = LazySingleton.getSingleton();
        System.out.println(singleton);

        HungrySingleton singleton1 = HungrySingleton.getInstance();
        System.out.println(singleton1);

    }
}
