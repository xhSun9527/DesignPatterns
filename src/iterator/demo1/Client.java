package iterator.demo1;

public class Client {

    public static void main(String[] args) {
        ConHandler1 handler1 = new ConHandler1();
        ConHandler2 handler2 = new ConHandler2();

        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handleRequest("ConHandler2");
    }
}
