package example;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();

        os.add(new Man());
        os.add(new Woman());

        os.accept(new Success());
        os.accept(new Failed());

    }
}
