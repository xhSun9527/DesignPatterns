package javaLang.singleTons;

/**
 * 静态内部类式单例
 * <p>
 * 在第一次加载StaticSingleTon时并不会初始化，只有在第一次调用getInstance方法时
 * 才会导致instance被初始化，因此，第一次调用getInstance方法会导致虚拟机加载
 * SingleTonHolder类
 * 这种方式不仅能确保线程安全，也能够保证单例对象的唯一性，同时也延迟了单例的实例化，所以
 * 这是推荐使用的单例模式实现方式
 */
public class StaticSingleTon {

    private StaticSingleTon() {
    }

    public static StaticSingleTon getInstance() {
        return SingleTonHolder.instance;
    }

    //静态内部类
    private static class SingleTonHolder {
        private static final StaticSingleTon instance = new StaticSingleTon();
    }

    public void toDo() {
        System.out.println("我是静态内部类式单例");
    }
}
