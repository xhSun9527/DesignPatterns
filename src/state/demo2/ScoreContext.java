package state.demo2;

/**
 * 环境类
 */
public class ScoreContext {
    private BaseState state;

    public ScoreContext() {
        this.state = new LowState(this);
    }

    public void setState(BaseState baseState){
        this.state = baseState;
    }


    public BaseState getState(){
        return this.state;
    }

    public void add(int score){
        state.addScore(score);
    }
}
