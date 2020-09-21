package javaLang.bridge.demo1;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {

        System.out.println("扩展抽象化角色RefinedAbstraction被访问");

        implementor.operationImpl();
    }
}
