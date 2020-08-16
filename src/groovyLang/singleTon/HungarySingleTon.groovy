package groovyLang.singleTon

class HungarySingleTon {
    private static HungarySingleTon instance = new HungarySingleTon()

    private HungarySingleTon() {

    }

    public static HungarySingleTon getInstance() {
        return instance
    }

    public void toDo() {
        println '我是饿汉时单例'
    }
}
