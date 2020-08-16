package javaLang.builder;

import javaLang.builder.higher.MilkTea;
import javaLang.builder.higher.Person;
import javaLang.builder.noamal.Builder;
import javaLang.builder.noamal.Director;
import javaLang.builder.noamal.MacBookBuilder;

public class ClientTest {

    public static void main(String[] args) {

//        higherBuilder();

        buildMilkTea();
    }

    private static void normalBuilder() {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);

        director.construct("Intel主板", "Retina显示器");

        System.out.println("Computer info : " + builder.build().toString());
    }

    private static void higherBuilder() {
        Person person = new Person.Builder("张三", "男")
                .setAge("16")
                .setClothes("红色")
                .setHouse("没有房子")
                .setMoney("没有钱")
                .build();

        System.out.println(person.toString());
    }

    private static void buildMilkTea() {
        MilkTea milkTea = new MilkTea.Builder()
                .joice("蓝莓汁")
                .tea("红茶")
                .bubble("珍珠")
                .sugar("少糖")
                .ice("不加冰")
                .build();

        System.out.println(milkTea.toString());
    }
}
