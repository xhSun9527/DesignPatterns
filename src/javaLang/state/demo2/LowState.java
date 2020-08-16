package javaLang.state.demo2;

/**
 * 不及格，具体状态类
 */
public class LowState extends BaseState {
    LowState(ScoreContext context) {
        mContext = context;
        stateName = "不及格";
        score = 0;
    }

    public LowState(BaseState baseState) {
        mContext = baseState.mContext;
        stateName = "不及格";
        score = baseState.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            mContext.setState(new HighState(this));
        } else if (score >= 60) {
            mContext.setState(new MiddleState(this));
        }
    }
}
