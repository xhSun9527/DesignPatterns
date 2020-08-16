package groovyLang.singleTon

/**
 * 懒汉式单例
 */
class LazySingleTon {
    private static LazySingleTon instance

    private LazySingleTon() {

    }

    static synchronized getInstance() {
        if (instance == null) {
            instance = new LazySingleTon()
        }
        return instance
    }

    public void toDO() {
        println '我是懒汉式单例'
    }

}