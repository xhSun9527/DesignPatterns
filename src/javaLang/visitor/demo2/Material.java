package javaLang.visitor.demo2;

/**
 * 抽象元素：材料
 */
public interface Material {
    String accept(Company visitor);
}
