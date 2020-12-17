package javaLang.mediator.Test1;

public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类 2 收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类 2 发送请求");
        mediator.relay(this); // 请中介者转发
    }
}
