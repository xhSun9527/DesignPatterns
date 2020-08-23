package javaLang.command.demo1;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        //调用具体命令对象的相关方法，执行具体命令
        command.execute();
    }
}
