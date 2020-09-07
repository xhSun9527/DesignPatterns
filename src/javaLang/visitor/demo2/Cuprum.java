package javaLang.visitor.demo2;

public class Cuprum implements Material{
    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
