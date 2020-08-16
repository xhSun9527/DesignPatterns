package javaLang.state.demo1;

/**
 * 电源操作接口
 */
public interface PowerController {
    /**
     * 开机
     */
    void powerOn();

    /**
     * 关机
     */
    void powerOff();
}
