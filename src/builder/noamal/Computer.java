package builder.noamal;

/**
 * 计算机抽象类，即Product
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected Computer() {
    }

    /**
     * 设置主板
     *
     * @param board
     */
    public void setBoard(String board) {
        mBoard = board;
    }

    /**
     * 设置显示器
     *
     * @param display
     */
    public void setDisplay(String display) {
        mDisplay = display;
    }

    /**
     * 设置操作系统
     */
    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
