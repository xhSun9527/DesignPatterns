package proxy.demo1;

public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("我想要吃饭");
    }
}
