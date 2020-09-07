package javaLang.visitor.demo1;

import java.util.Random;

public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    protected void accept(Visitor visitor) {

        visitor.visit(this);
    }

    //经理本年的产品数量
    public int getProduct(){
        return new Random().nextInt(10);
    }
}

