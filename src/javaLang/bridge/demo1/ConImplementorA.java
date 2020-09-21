package javaLang.bridge.demo1;

public class ConImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化角色A");
    }
}
