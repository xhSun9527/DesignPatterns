package javaLang.proxy.demo2;

public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("我想去旅游");
    }
}
