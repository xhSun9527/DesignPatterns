package javaLang.bridge.demo1;

public class Client {
    public static void main(String[] args) {

        Implementor implementor = new ConImplementorA();

        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
