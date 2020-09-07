package javaLang.visitor.demo1;

public interface Visitor {

    public void visit(Engineer engineer);

    public void visit(Manager manager);
}
