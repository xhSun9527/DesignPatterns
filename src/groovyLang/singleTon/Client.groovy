package groovyLang.singleTon

class Client {
    static main(args){

        LazySingleTon.getInstance().toDO()

        HungarySingleTon.getInstance().toDo()

        DCLSingleTon.getInstance().toDo()

    }


}
