package proxy.dynamic;

public class Person1 implements ILawSuit {
    @Override
    public void submit() {
        System.out.println("Person1 提交申请");
    }

    @Override
    public void burden() {
        System.out.println("Person1 进行举证");
    }

    @Override
    public void defend() {
        System.out.println("Person1 开始辩护");
    }

    @Override
    public void finish() {
        System.out.println("Person1 诉讼完成");
    }
}
