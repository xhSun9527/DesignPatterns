package javaLang.templete.demo1;

/**
 * 抽象的Computer
 */
public abstract class AbstractComputer {
    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("检查硬件");
    }

    protected void loadOs() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机无密码验证，直接通过");
    }

    /**
     * 启动计算机方法，步骤固定为：开启电源、检查硬件、加载操作系统、用户登录
     * 该方法定义为final，防止算法框架被复写
     */
    public final void startUp() {
        System.out.println("------------开机 START-------------");
        powerOn();

        checkHardware();

        loadOs();

        login();
        System.out.println("------------开机 END-------------");
    }
}

