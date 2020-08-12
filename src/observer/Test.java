package observer;

import observer.Test1.BinaryObserver;
import observer.Test1.HexaObserver;
import observer.Test1.OctalObserver;
import observer.Test1.Subject;
import observer.Test2.Reader1;
import observer.Test2.Reader2;
import observer.Test2.Reader3;

public class Test {
    public static void main(String[] args) {
        test2();
    }

    private static void test1(){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

    private static void test2(){
        observer.Test2.Subject subject = new observer.Test2.Subject();
        new Reader1(subject);
        new Reader2(subject);
        new Reader3(subject);

        subject.setName("天龙八八");
        subject.notifyAllObserver();
    }
}
