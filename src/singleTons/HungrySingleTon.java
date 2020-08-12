package singleTons;

/**
 * 饿汉式单例
 */
public class HungrySingleTon {
    //声明的时候即将对象初始化，且为 static final 对象
    private static final HungrySingleTon instance = new HungrySingleTon();

    private HungrySingleTon() {
    }

    public static HungrySingleTon getInstance() {
        return instance;
    }

    public void toDo() {
        System.out.println("我是饿汉式单例");
    }
}
