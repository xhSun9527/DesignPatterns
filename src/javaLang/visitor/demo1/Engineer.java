package javaLang.visitor.demo1;

import sun.reflect.generics.visitor.Visitor;

import java.util.Random;

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    protected void accept(javaLang.visitor.demo1.Visitor visitor) {

        visitor.visit(this);
    }


    //工程师本年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
