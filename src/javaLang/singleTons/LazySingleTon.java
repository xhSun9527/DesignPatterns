package javaLang.singleTons;

/**
 * 懒汉式单例
 * 缺点：第一次调用的时候instance会初始化，每次调用getInstance方法都会进行同步
 * 这样会消耗不必要的资源。
 * 第一次加载时需要及时进行实例化，反映稍慢
 */
public class LazySingleTon {

    //声明一个静态对象，并在用户第一次调用getInstance时进行初始化
    private static LazySingleTon instance;

    private LazySingleTon() {
    }


    /**
     * 添加了synchronized关键字，也就是说getInstance是一个同步方法，这就是在多线程
     * 情况下保证单例对象唯一性的手段。
     *
     * @return
     */
    public static synchronized LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }

    public void toDo() {
        System.out.println("我是懒汉式单例");
    }
}
