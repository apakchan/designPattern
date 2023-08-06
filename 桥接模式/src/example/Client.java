package example;

public class Client {
    public static void main(String[] args) {
        Phone p1 = new HUAWEI();
        p1.add(new AddressList());
        p1.add(new Game());

        Phone p2 = new Iphone();
        p2.add(new AddressList());
        p2.add(new Game());

        p1.run();
        p2.run();
    }
}
