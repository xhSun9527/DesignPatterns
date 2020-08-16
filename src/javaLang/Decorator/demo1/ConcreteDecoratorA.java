package javaLang.Decorator.demo1;

/**
 * 装饰者具体实现A
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();

        super.operate();

        operateB();
    }

    private void operateA(){
        System.out.println("I am operate A in Decorate A");
    }

    private void operateB(){
        System.out.println("I am operate B in Decorate A");
    }
}
