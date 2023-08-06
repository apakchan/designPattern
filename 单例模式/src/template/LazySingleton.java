package template;

/**
 * @author 陈柏宇
 * 单例模式
 * 懒汉式单例模式，充分考虑多线程情况并优化效率
 */

public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {

    }

    public  static LazySingleton getSingleton() {

        /*
        方式一：
        效率稍差
         */

//        synchronized (Singleton.class){
//            if (singleton == null){
//                singleton = new Singleton();
//            }
//        }

        /*
        方式二：
        效率高
         */
        if(singleton == null) {
            synchronized (LazySingleton.class) {
                if(singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
