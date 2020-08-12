package state.demo1;

/**
 * 关机状态，此时只有开机功能是有效的
 */
public class PowerOffState implements TvState{
    @Override
    public void nextChannel() {

    }

    @Override
    public void preChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
