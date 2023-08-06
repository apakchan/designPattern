package example;

/**
 * 具体手机类 华为
 */

public class HUAWEI extends Phone{
    @Override
    public void run() {
        for (Soft soft : softs) {
            System.out.println("华为手机的" + soft.run());
        }
    }
}
