package javaLang.mediator.Test1;

public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类 1 收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类 1 发出请求");
        mediator.relay(this); // 请中介者转发
    }
}
