package groovyLang.singleTon

/**
 * 双重校验锁单例
 */
class DCLSingleTon {
    private static DCLSingleTon instance

    private DCLSingleTon(){}

    public static DCLSingleTon getInstance(){
        if (instance == null){
            synchronized (DCLSingleTon.class){
                if (instance == null){
                    instance = new DCLSingleTon()
                }
            }
        }

        return instance
    }

    public void toDo(){
        println '我是DCL模式的单例'
    }
}
