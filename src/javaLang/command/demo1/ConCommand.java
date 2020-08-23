package javaLang.command.demo1;

/**
 * 具体命令类
 */
public class ConCommand implements Command {
    //持有一个对接收者对象的引用
    private Receiver receiver;

    @Override
    public void execute() {
        //调用接收者的相关方法来执行具体逻辑
        receiver.action();
    }

    public ConCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
