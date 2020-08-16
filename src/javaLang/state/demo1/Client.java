package javaLang.state.demo1;

public class Client {
    public static void main(String[] args) {
        TvController controller = new TvController();
        //开机
        controller.powerOn();

        //下个频道
        controller.nextChannel();

        //上个频道
        controller.preChannel();

        //调高音量
        controller.turnUp();

        //关机
        controller.powerOff();

        //调低音量，此时不会生效
        controller.turnDown();
    }
}
