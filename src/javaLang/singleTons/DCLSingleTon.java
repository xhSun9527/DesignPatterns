package javaLang.singleTons;

/**
 * DCL双重校验锁单例
 */
public class DCLSingleTon {
    //声明静态对象
    private static volatile DCLSingleTon instance;

    //构造函数私有
    private DCLSingleTon() {
    }

    //双重判空并加锁，锁住的是这个类的对象
    public static DCLSingleTon getInstance() {
        if (instance == null) {
            synchronized (DCLSingleTon.class) {
                if (instance == null) {
                    instance = new DCLSingleTon();
                }
            }
        }
        return instance;
    }

    public void toDo() {
        System.out.println("我是DCL式单例");
    }
}
