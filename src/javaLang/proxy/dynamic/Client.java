package javaLang.proxy.dynamic;


import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        dynamicProxy();
    }

    private static void staticProxy(){
        ILawSuit person1 = new Person1();
        Lawyer lawyer = new Lawyer(person1);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    private static void dynamicProxy(){
        ILawSuit person = new Person1();

        //构造一个动态代理
        DynamicProxy proxy = new DynamicProxy(person);

        //获取person的ClassLoader
        ClassLoader classLoader = person.getClass().getClassLoader();

        ILawSuit lawyer = (ILawSuit) Proxy.newProxyInstance(classLoader,new Class[]{ILawSuit.class},proxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
