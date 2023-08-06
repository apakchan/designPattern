package example;

public class BabySingleton {
    private static BabySingleton baby;

    private BabySingleton() {
        System.out.println("开始造人");
    }

    public static BabySingleton getInstance() {
        if (baby == null) {
            synchronized (BabySingleton.class){
                if (baby == null){
                    baby = new BabySingleton();
                }
            }
        }
        return baby;
    }
}
