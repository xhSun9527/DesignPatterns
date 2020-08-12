package builder.noamal;

/**
 * 具体的产品类
 */
public class MacBook extends Computer {
    protected MacBook() {

    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 10.10";
    }
}
