package Decorator;

import Decorator.Demo2.*;
import Decorator.demo1.*;

public class Client {

    public static void main(String[] args) {
        demo2();
    }

    private static void demo1(){
        //构造被装饰的组件对象
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();

        Decorator decorator1 = new ConcreteDecoratorB(component);
        decorator1.operate();
    }


    private static void demo2(){
        Person person = new Boy();

        PersonCloth cloth1 = new ExpensiveCloth(person);
        cloth1.dressed();


        PersonCloth cloth2 = new CheapCloth(person);
        cloth2.dressed();
    }
}
