package state.demo2;

public class HighState extends BaseState {

    HighState(BaseState baseState) {
        mContext = baseState.mContext;
        stateName = "优秀";
        score = baseState.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            mContext.setState(new LowState(this));
        } else if (score < 90) {
            mContext.setState(new MiddleState(this));
        }
    }
}
