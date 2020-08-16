package javaLang.Decorator.demo1;

/**
 * 抽象装饰者
 */
public abstract class Decorator extends Component{
    //持有一个Component对象的引用
    private Component component;

    /**
     * 必要的构造器，需要一个Component类型的对象
     * @param component Component类型的对象
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
