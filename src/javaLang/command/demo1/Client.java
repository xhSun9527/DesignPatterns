package javaLang.command.demo1;

public class Client {

    public static void main(String[] args) {

        //构造一个接收者对象
        Receiver receiver = new Receiver();

        //根据接收者对象构造一个命令对象
        Command command = new ConCommand(receiver);

        //根据具体对象构造请求者对象
        Invoker invoker = new Invoker(command);

        //执行请求方法
        invoker.action();
    }
}
