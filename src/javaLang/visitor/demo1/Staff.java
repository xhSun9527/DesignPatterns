package javaLang.visitor.demo1;



import java.util.Random;

/**
 * 员工基类
 */
public abstract class Staff {
    public String name;

    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt();
    }

    protected abstract void accept(Visitor visitor);
}
