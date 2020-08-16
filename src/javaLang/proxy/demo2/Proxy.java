package javaLang.proxy.demo2;

public class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        beforeVisit();
        realSubject.visit();
        afterVisit();
    }

    private void beforeVisit(){
        System.out.println("出发之前，指定旅游攻略");
    }

    private void afterVisit(){
        System.out.println("旅游后，收集用户反馈");
    }
}
