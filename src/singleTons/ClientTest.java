package singleTons;

public class ClientTest {

    public static void main(String[] args) {
        DCLSingleTon.getInstance().toDo();

        LazySingleTon.getInstance().toDo();

        HungrySingleTon.getInstance().toDo();

        StaticSingleTon.getInstance().toDo();
    }
}
