package javaLang.mediator.Test2;

public class Client {

    public static void main(String[] args) {
        Medium medium = new Extate();

        Custom seller = new Saller("张三（卖方）");
        Custom buyer = new Buyer("李四（买方）");

        medium.register(seller);
        medium.register(buyer);
    }
}
