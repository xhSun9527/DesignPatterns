package javaLang.mediator.Test2;

/**
 * 抽象中介者：中介公司
 */
public interface Medium {

    //客户注册
    void register(Custom custom);

    //转发
    void relay(String from, String ad);
}
