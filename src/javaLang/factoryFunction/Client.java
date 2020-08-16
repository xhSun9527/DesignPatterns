package javaLang.factoryFunction;

import javaLang.factoryFunction.normal.ConcreteFactory;
import javaLang.factoryFunction.normal.Factory;
import javaLang.factoryFunction.normal.Product;
import javaLang.factoryFunction.reflact.AudiCarFactory;
import javaLang.factoryFunction.reflact.AudiFactory;
import javaLang.factoryFunction.reflact.AudiQ3;
import javaLang.factoryFunction.reflact.AudiQ7;

public class Client {

    public static void main(String[] args) {
        reflact();
    }

    private static void normal(){
        Factory factory = new ConcreteFactory();

        Product product = factory.createProduct();
        product.method();
    }

    private static void reflact(){
        AudiFactory factory = new AudiCarFactory();
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();

        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
