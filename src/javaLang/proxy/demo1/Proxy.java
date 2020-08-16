package javaLang.proxy.demo1;

public class Proxy implements Subject {
    private RealSubject realSubject = new RealSubject();


    @Override
    public void say() {

        before();
        realSubject.say();
        after();

    }

    private void before(){
        System.out.println("吃饭前先洗手");
    }

    private void after(){
        System.out.println("饭后要擦嘴");
    }
}
