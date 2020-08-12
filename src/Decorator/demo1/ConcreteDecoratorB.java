package Decorator.demo1;


/**
 * 装饰者具体实现A
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();

        super.operate();

        operateB();
    }

    private void operateA(){
        System.out.println("I am operate A in Decorate B");
    }

    private void operateB(){
        System.out.println("I am operate B in Decorate B");
    }
}
