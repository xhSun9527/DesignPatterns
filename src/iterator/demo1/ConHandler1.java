package iterator.demo1;

/**
 * 具体处理者 1 号
 */
public class ConHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConHandler1")) {
            System.out.println("1号处理者已经完成了请求的处理");
        } else {
            successor.handleRequest(condition);
        }
    }
}
