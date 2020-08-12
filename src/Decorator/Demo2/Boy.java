package Decorator.Demo2;

/**
 * 具体的被装饰着对象
 */
public class Boy extends Person {
    @Override
    public void dressed() {
        System.out.println("穿了内衣内裤");
    }
}
