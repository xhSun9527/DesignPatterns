package state.demo1;

/**
 * 电视机状态接口，定义了电视操作的方法
 */
public interface TvState {

    /**
     * 下个频道
     */
    void nextChannel();

    /**
     * 上个频道
     */
    void preChannel();

    /**
     * 调高音量
     */
    void turnUp();

    /**
     * 调低音量
     */
    void turnDown();
}
