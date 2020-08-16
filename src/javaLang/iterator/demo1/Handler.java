package javaLang.iterator.demo1;

/**
 * 抽象处理者角色
 */
public abstract class Handler {
    //下一个节点的处理者
    Handler successor;

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
