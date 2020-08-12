package state.demo2;

public class MiddleState extends BaseState {
    MiddleState(BaseState baseState) {
        mContext = baseState.mContext;
        stateName = "中等";
        score = baseState.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            mContext.setState(new LowState(this));
        } else if (score >= 90) {
            mContext.setState(new HighState(this));
        }
    }
}
