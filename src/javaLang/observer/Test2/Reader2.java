package javaLang.observer.Test2;

public class Reader2 extends Observer {

    public Reader2(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + "收到" +subject.getName()+"更新了");
    }
}
