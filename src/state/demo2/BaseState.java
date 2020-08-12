package state.demo2;

public abstract class BaseState {
    //状态名
    protected String stateName;
    protected ScoreContext mContext;
    //分数
    protected int score;

    /**
     * 检查当前状态
     */
    public abstract void checkState();

    public void addScore(int score) {
        this.score += score;
        System.out.println("加上： " + score + "分，\t当前分数： " + this.score);

        checkState();
        System.out.println("分，\t当前状态： " + mContext.getState().stateName);
    }
}
