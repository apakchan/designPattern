package example;

/**
 * 具体手机类 苹果
 */

public class Iphone extends Phone{
    @Override
    public void run() {
        for (Soft soft : softs) {
            System.out.println("苹果手机的" + soft.run());
        }
    }
}
