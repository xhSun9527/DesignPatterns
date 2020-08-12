package state.demo1;

/**
 * 电视遥控器，类似于上下文环境
 */
public class TvController implements PowerController {

    private TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("电视开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("电视已关机");
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void preChannel() {
        tvState.preChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }
}
