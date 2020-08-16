package javaLang.iterator.demo1;

/**
 * 具体处理者 2 号
 */
public class ConHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConHandler2")) {
            System.out.println("2号处理者已经完成了请求的处理");
        } else {
            successor.handleRequest(condition);
        }
    }
}
