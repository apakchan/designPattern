package example;

public class Test {
    public static void main(String[] args) {
        KFC kfc1 = new HuaiAnKFC();
        KFCCooker.construct(kfc1);

        kfc1.getProduct().show();

        KFC kfc2 = new NanJingKFC();
        KFCCooker.construct(kfc2);
        kfc2.getProduct().show();
    }
}
