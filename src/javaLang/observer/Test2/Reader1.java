package javaLang.observer.Test2;

public class Reader1 extends Observer {

    public Reader1(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + "收到" + subject.getName() + "更新了");
    }
}
