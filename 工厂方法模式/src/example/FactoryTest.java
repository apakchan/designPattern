package example;

/**
 * @author 陈柏宇
 * 测试
 */

public class FactoryTest
{
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();

        LeiFeng undergraduate = factory.createLeiFeng();

        undergraduate.BuyRice();
        undergraduate.sweep();
        undergraduate.Wash();
    }
}
